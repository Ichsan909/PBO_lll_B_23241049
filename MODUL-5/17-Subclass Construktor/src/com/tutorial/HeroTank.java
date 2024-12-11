package com.tutorial;

public class HeroTank extends Hero {
    //atribut
    String atribut = "Tank";

    //method
    HeroTank(String nama, double defance, double attack){
        super(nama, defance, attack);
    }

    //overriding cetak()
    void cetak(){
        System.out.println("Hero : " + this.atribut);
        super.cetak();
    }
    
}
