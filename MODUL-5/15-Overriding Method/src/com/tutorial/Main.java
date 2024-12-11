package com.tutorial;

public class Main {
    public static void main(String[] args) {
        //membuat objek dari superclass
        Hero hero1 = new Hero();
        hero1.nama = "papadhot";
        System.out.println("hero dari superClass");
        hero1.cetak();

        //membuat objek dari superclass
        HeroTank hero2 = new HeroTank();
        hero2.nama = "kakasih";
        hero2.defencePower = 200;
        hero2.cetak();

    }
}
