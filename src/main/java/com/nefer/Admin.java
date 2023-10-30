package com.nefer;

public class Admin {

    private GuitarRepository guitarRepository = new GuitarRepository(); //singleton

    public void add(String name) {
        System.out.println("add complete");
    }

    public void delete(String name) {
        System.out.println("delete complete");
    }


}
