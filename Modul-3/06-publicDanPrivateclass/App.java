class Player {
    // data member
    String nama; // default, bisa diakses dari luar kelas
    public int exp; // public, bisa diakses dari luar kelas
    private int health;//private tidak bisa di akses dari luar

    // constructor, tanpa modifikasi akses 
    Player(String nama, int exp, int health) {
        this.nama = nama;
        this.exp = exp;
        this.health = health;
    }
    //method ,default modifier accsess
    void cetak(){
        kurangExp();
        System.out.println("Player : " + this.nama);
        System.out.println("exp : " + this.exp);
        System.out.println("health : " + this.health);


    }
    public void ubahHealth(int healthBaru){
        this.health = healthBaru;
    }
    //method untuk private modifier acses
    private void kurangExp(){
        this.exp -= 1; //setiap di jalani exp berkurang 1
    }
}

public class App {
    public static void main(String[] args) {
        // instansiasi object dengan dua parameter
        Player player1 = new Player("saitama", 50, 100);

        // default membaca data
        System.out.println(player1.nama);

        // mengubah data
        player1.nama = "conan";
        System.out.println(player1.nama);

        // public membaca data
        System.out.println(player1.exp);

        // mengubah exp
        player1.exp = 75;
        System.out.println(player1.exp);

        // //mengubah akses vripate
        // System.out.println(player1.health);
        // //menulis data
        // player1.health = 120;
        // System.out.println(player1.health);


        //method deaflut
        player1.cetak();

        player1.ubahHealth(125);
        player1.cetak();

        //method private
        player1.cetak();
    }
}
