package com.nefer;

public class Guitar {

    private Long id;
    private String name;
    private GuitarStatus guitarStatus;

    public Guitar(String name) { //하나의 주 생성자 활용하기
        this(-1L, name, GuitarStatus.AVAILABLE);
    }

    public Guitar(Long id, String name, GuitarStatus guitarStatus) {
        this.id = id;
        this.name = name;
        this.guitarStatus = guitarStatus;
    }

    public void borrow() {
        System.out.println("대출완료");
    }

    public void returnGuitar() {
        System.out.println("반납완료");
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Guitar{" +
                "id=" + id +
                ", name=" + name + ", guitarStatus=" + guitarStatus +
                '}';
    }
}
