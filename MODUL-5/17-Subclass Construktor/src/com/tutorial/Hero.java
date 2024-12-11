package com.tutorial;

public class Hero {
    //atribut
    String nama;
    double defancePower;
    double attackPower;


    //constroctor
    Hero(String nama, double defancePower, double attackPower){
        this.nama = nama;
        this.defancePower = defancePower;
        this.attackPower = attackPower;


    }

    //method
    void cetak(){
        System.out.println("nama : " + this.nama);
        System.out.println("defancePower : " + this.defancePower);
        System.out.println("attackPower : " + this.attackPower);
    }
    
}
