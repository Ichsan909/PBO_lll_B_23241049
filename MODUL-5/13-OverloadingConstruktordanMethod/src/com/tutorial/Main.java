package com.tutorial;

public class Main {
    public static void main(String[] args) {
        //membuat objek
        Player player1 = new Player("kona");
        Player player2 = new Player();
        Player player3 = new Player();
        Player player4 = new Player("dhot");


        player1.cetak();
        player2.cetak();
        player3.cetak();
        player4.cetak();
    }
    
}
