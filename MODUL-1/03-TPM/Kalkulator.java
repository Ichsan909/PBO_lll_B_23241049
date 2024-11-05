import java.util.Scanner;

public class Kalkulator {
    private double angka1; 
    private double angka2; 
    private double hasil;  

    // Konstruktor
    public Kalkulator() {
        this.angka1 = 0.0;
        this.angka2 = 0.0;
        this.hasil = 0.0;
    }

    //mtd opr
    public void hitung(int pilihan) {
        switch (pilihan) {
            case 1: // Tambah
                hasil = angka1 + angka2;
                break;
            case 2: // Kurang
                hasil = angka1 - angka2;
                break;
            case 3: // Kali
                hasil = angka1 * angka2;
                break;
            case 4: // Bagi
                if (angka2 == 0) {
                    throw new ArithmeticException("Error: Pembagian dengan nol tidak diperbolehkan.");
                }
                hasil = angka1 / angka2;
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                break;
        }
    }

    // Metode untuk mengatur angka
    public void setAngka(double a, double b) {
        this.angka1 = a;
        this.angka2 = b;
    }

    // Metode untuk mendapatkan hasil
    public double getHasil() {
        return hasil;
    }

    public static void main(String[] args) {
        Kalkulator kalkulator = new Kalkulator();
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== KALKULATOR SEDERHANA =====");
            System.out.println("1. Tambah");
            System.out.println("2. Kurang");
            System.out.println("3. Kali");
            System.out.println("4. Bagi");
            System.out.println("5. Keluar");
            System.out.print("Pilih operasi (1-5): ");

            int pilihan = input.nextInt();

            if (pilihan == 5) {
                System.out.println("Terima kasih telah menggunakan kalkulator.");
                break;
            }

            System.out.print("Masukkan angka pertama: ");
            double angka1 = input.nextDouble();
            System.out.print("Masukkan angka kedua: ");
            double angka2 = input.nextDouble();

            kalkulator.setAngka(angka1, angka2); // Mengatur angka

            try {
                kalkulator.hitung(pilihan); // Melakukan perhitungan
                System.out.println("Hasil: " + kalkulator.getHasil()); // Menampilkan hasil
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            }
        }

        input.close();
    }
}
