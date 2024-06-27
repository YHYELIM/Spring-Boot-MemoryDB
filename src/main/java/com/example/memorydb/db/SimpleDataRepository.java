package com.example.memorydb.db;

import com.example.memorydb.entity.Entity;

import java.util.*;
import java.util.stream.Collectors;

//추상클래스로 만들어서
//상속 받은 애들이 구현을 해도 되고 안해도 되는 형태
abstract public class SimpleDataRepository<T extends Entity,ID extends Long>  implements DataRepository<T, ID>{

    //자신만의 저장 공간

    private List<T> dataList = new ArrayList<T>(); // 저장 공간 초기화
    private static long index = 0; //0부터 index 부여


    //정렬
    private Comparator<T> sort = new Comparator<T>() {
        @Override
        public int compare(T o1, T o2) {
            return Long.compare(o1.getId(), o2.getId());
        }
    };



    //create,update
    @Override
    public T save(T data) { // T : Entity인 셈

        if(Objects.isNull(data)){
            throw new RuntimeException("Data is null");
        }

        //db에 데이터가 있는가?
        var prevData = dataList.stream()
                .filter(it -> {
                   return it.getId().equals(data.getId());
                })
                        .findFirst();

        //데이터가 있으면 update, 없으면 insert
        if (prevData.isPresent()){
            //기존 데이터 있는 경우 : 업데이트
            dataList.remove(prevData);
            dataList.add(data);
            //기존 데이터를 삭제하고 빈자리에 다시 집어넣음
            //이때 id는 유지
        } else {
            //기존 데이터 없는 경우
            //unique id 지정
            index++;
            data.setId(index);
            dataList.add(data);

        }


        return null;
    }

    //read
    @Override
    public Optional<T> findById(ID id){ // Optional: 리턴 데이터 있을수도 없을수도 있기 때문 //id: Long 타입
        return dataList.stream()
                .filter(it -> {
                    return  (it.getId().equals(id));
                })
                .findFirst(); //첫번째꺼 찾아서 리턴
    }

    @Override
    public List<T> findAll() {
        return dataList
                .stream()
                .sorted(sort)
                .collect(Collectors.toList());
    }

    //delete
    @Override
    public void delete(ID id){
        var deleteEntity = dataList.stream()
                .filter(it -> {
                    return  (it.getId().equals(id));
                })
                .findFirst();

        if (deleteEntity.isPresent()){
            dataList.remove(deleteEntity);
        }

    }

}
