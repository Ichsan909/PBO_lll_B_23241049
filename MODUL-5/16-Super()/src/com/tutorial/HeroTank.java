package com.tutorial;

public class HeroTank extends Hero {
    //atribut baru
    String nama = "Class Hero Tank";

    //overriding method
    void cetak(){
        System.out.println("ini adalah : " + super.nama);
        this.dummyMethod();
    }

    void dummyMethod(){
        System.out.println("method ini ada di subclass");
    }
    
}
