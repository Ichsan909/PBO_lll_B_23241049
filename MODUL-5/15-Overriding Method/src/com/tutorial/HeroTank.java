package com.tutorial;

//ini subclass
public class HeroTank extends Hero {
    //overriding 
    double defencePower;

    //overriding method
    void cetak(){
        System.out.println("Hero dari subClass");
        System.out.println("HeroTank");
        System.out.println("Hero : " + this.nama);
        System.out.println("DefancePower : " + this.defencePower);
    }
    
}
