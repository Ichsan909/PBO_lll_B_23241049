import java.util.ArrayList;

class Player {
    // variable objek
    private String nama;
    // variable static
    private static int numberOfPlayer;
    // Array variable
    private static ArrayList<String> namaList = new ArrayList<String>();

    // Constructor
    Player(String nama) {
        this.nama = nama;
        Player.numberOfPlayer++;
        Player.namaList.add(this.nama);
    }

    // Static method to print number of players
    static void showNumberOfPlayer() {
        System.out.println("Number Of Player: " + Player.numberOfPlayer);
    }

    // Method to print player name
    void cetak() {
        System.out.println("Player name: " + this.nama);
    }

    // Static getter method to return the list of names
    static ArrayList<String> getName() {
        return Player.namaList;
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        // Creating player objects
        Player player1 = new Player("Ilham");
        Player player2 = new Player("Arbiyan");
        Player player3 = new Player("Adin");
        Player player4 = new Player("Eril");
        Player player5 = new Player("Mesud");
        Player player6 = new Player("Azam");

        // Display the number of players
        Player.showNumberOfPlayer();

        // Call 'cetak' method for each player
        player1.cetak();
        player2.cetak();
        player3.cetak();
        player4.cetak();
        player5.cetak();
        player6.cetak();

        // Print the list of player names
        System.out.println("\nPlayer Names List: " + Player.getName());
    }
}
