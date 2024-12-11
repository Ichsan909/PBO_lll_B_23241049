package com.tutorial;

public class Player {
    //atribut
    private String name;
    private static int jumlahPlayer;

    //construktor
    //opsi pertama untuk membuat objek
    Player (String name){
        Player.jumlahPlayer++;
        this.name = name;
    }

    //overloading construktor
    //opsi kedua untuk membuat objek default
    Player(){
        Player.jumlahPlayer++;
        this.name = "player" + Player.jumlahPlayer;
    }

    //method
    void cetak(){
        System.out.println("name : " + this.name);
    }
}
