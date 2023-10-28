package com.nefer;

public class Guitar {

    private Long id;
    private String name;
    private GuitarStatus guitarStatus;

    public void borrow() {
        System.out.println("대출완료");
    }

    public void returnGuitar() {
        System.out.println("반납완료");
    }
}
