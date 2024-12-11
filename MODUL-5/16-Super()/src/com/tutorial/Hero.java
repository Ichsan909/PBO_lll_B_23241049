package com.tutorial;

public class Hero {
    String nama = "Class Hero";

    //method
    void cetak(){
        System.out.println("ini adalah : " + this.nama);
    }
    
    //method
    void dummyMethod(){
        System.out.println("ini ada di superclass : " + this.nama);
    }
}
