package com.sofka.patient;

public class Owner {
    private String DNI;
    private String name;
    private String cellphone;
    private int age;

    //Constructor
    public Owner(String DNI, String name, String cellphone, int age){
        this.DNI = DNI;
        this.name = name;
        this.cellphone = cellphone;
        this.age = age;
    }
}
