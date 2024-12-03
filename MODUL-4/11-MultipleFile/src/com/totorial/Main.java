package src.com.totorial;

import src.com.terminal.Console;

public class Main {
    public static void main(String[] args) {
        //membuat object
        Player player1 = new Player("ishigami sengkuni");
        Player player2 = new Player("anis baswedan");
        Player player3 = new Player("prabowo subianto");
        player1.cetak();
        player2.cetak();
        player3.cetak();

        Console.log("Eror teruss");
    }
    
}
