package com.nefer;

import java.util.Comparator;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.TreeSet;

public class GuitarRepository {

    private Long guitarNum = 0L;
    TreeSet<Guitar> guitarList = new TreeSet<>(new Comparator<>() {
        @Override
        public int compare(Guitar o1, Guitar o2) {
            return o1.getName().compareTo(o2.getName()); //o1이 크면 양수, implement because of search func
        }
    });

    public void add(String name) {
        Guitar guitar = new Guitar(guitarNum++, name, GuitarStatus.BORROWED);
        guitarList.add(guitar);
    }

    public void delete(String name) {
        Optional<Guitar> optional = this.search(name);
        Guitar guitar = optional.orElseThrow(() -> new NoSuchElementException("값이 존재하지 않습니다."));

        guitarList.remove(guitar);
    }

    public Optional<Guitar> search(String guitarName) {
        // 이름으로 검색하고 해당 객체 반환
        Guitar guitar = new Guitar(guitarName); //검색할 키가 될 객체 생성
        Optional<Guitar> returnValue = Optional.ofNullable(null); //Optional 반환할거라 미리 생성해놓음

        Guitar foundGuitar = guitarList.ceiling(guitar); //ceiling: 크거나 같은 최소 요소를 검색한다

        if (foundGuitar != null && foundGuitar.getName().equals(guitarName)) { //foundGuitar not null and same as key
            return returnValue.of(foundGuitar);
        }

        return returnValue;
    }
}
