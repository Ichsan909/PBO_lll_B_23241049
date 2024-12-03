package com.tutorial;

import com.terminal.Console;
class Player {
    //visibiliti default hanya isa di aksses oleh package yang sama

    //variabel objec
    private String nama;


    //constructor
    Player(String nama){
        this.nama = nama;
    }
    //method cetak
    void cetak(){
        System.out.println("Nama : "+ this.nama);
        Console.log("menggunakan consol");
        Console.log("Nama: "+ this.nama);
    }

}