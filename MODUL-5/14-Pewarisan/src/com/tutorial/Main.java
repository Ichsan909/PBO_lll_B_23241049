package com.tutorial;

public class Main {
    public static void main(String[] args) {
        //membuat objek dari superclass
        Hero hero1 = new Hero();
        hero1.name = "kona";
        hero1.cetak();

        //membuat objek dari subclass
        HeroStrength hero2 = new HeroStrength();
        hero2.name = "peot";
        hero2.cetak();

        HeroIntell hero3 = new HeroIntell();
        hero3.name = "robi";
        hero3.cetak();
    }
}
