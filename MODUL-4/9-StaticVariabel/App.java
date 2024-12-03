class Display {
    // Variabel instans (milik setiap objek)
    private String nama;

    // Variabel statik (berbagi antar semua instansi)
    static String tipe = "Display"; // Nilai default untuk semua objek

    // Konstruktor untuk menginisialisasi variabel 'nama'
    Display(String nama) {
        this.nama = nama;
    }

    // Setter untuk mengubah variabel statik 'tipe'
    void setTipe(String tipeInput) {
        // Mengubah variabel statik 'tipe', ini akan mempengaruhi semua objek
        Display.tipe = tipeInput;
    }

    // Metode untuk menampilkan nama display
    void cetak() {
        System.out.println("Nama Display: " + this.nama);
    }

    // Metode statik untuk menampilkan nilai variabel statik 'tipe'
    static void tampilkanTipe() {
        System.out.println("Nilai 'tipe' saat ini: " + Display.tipe);
    }
}

public class App {
    public static void main(String[] args) {
        // Membuat objek Display
        Display display1 = new Display("CPU");
        display1.cetak(); // Menampilkan nama dari objek pertama

        Display display2 = new Display("HP");
        display2.cetak(); // Menampilkan nama dari objek kedua

        // Menampilkan nilai awal dari variabel statik 'tipe'
        System.out.println("\nMenampilkan nilai variabel statik 'tipe':");
        Display.tampilkanTipe();

        // Mengubah nilai variabel statik 'tipe' langsung melalui kelas
        Display.tipe = "Tampilan";

        // Menampilkan nilai 'tipe' yang sudah diubah
        System.out.println("\nSetelah mengubah 'tipe' langsung:");
        Display.tampilkanTipe();

        // Menggunakan metode setter untuk mengubah 'tipe' menjadi "Spanduk"
        display1.setTipe("Spanduk");

        // Menampilkan nilai 'tipe' setelah menggunakan setter
        System.out.println("\nSetelah menggunakan setter untuk mengubah 'tipe':");
        Display.tampilkanTipe();

        // Menampilkan 'tipe' dari kedua objek untuk menunjukkan perubahan pada semua
        // objek
        System.out.println("\nMengakses 'tipe' melalui kedua objek:");
        System.out.println("display1: " + display1.tipe);
        System.out.println("display2: " + display2.tipe);
    }
}
