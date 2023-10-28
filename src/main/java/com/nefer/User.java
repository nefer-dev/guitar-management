package com.nefer;

public class User {

    private Long id;
    private String name;

    public void borrow(Guitar guitar) {
        guitar.borrow();
    }

    public void returnGuitar(Guitar guitar) {
        guitar.returnGuitar();
    }
}
