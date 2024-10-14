import java.util.Scanner;

public class Kalkulator {

    // Metode untuk penjumlahan
    public double tambah(double a, double b) {
        return a + b;
    }

    // Metode untuk pengurangan
    public double kurang(double a, double b) {
        return a - b;
    }

    // Metode untuk perkalian
    public double kali(double a, double b) {
        return a * b;
    }

    // Metode untuk pembagian
    public double bagi(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Error: Pembagian dengan nol tidak diperbolehkan.");
        }
        return a / b;
    }

    public static void main(String[] args) {
        // Membuat objek kalkulator
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

            double hasil = 0;
            boolean error = false;

            // Melakukan operasi berdasarkan pilihan
            switch (pilihan) {
                case 1:
                    hasil = kalkulator.tambah(angka1, angka2);
                    break;
                case 2:
                    hasil = kalkulator.kurang(angka1, angka2);
                    break;
                case 3:
                    hasil = kalkulator.kali(angka1, angka2);
                    break;
                case 4:
                    try {
                        hasil = kalkulator.bagi(angka1, angka2);
                    } catch (ArithmeticException e) {
                        System.out.println(e.getMessage());
                        error = true;
                    }
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    error = true;
                    break;
            }

            if (!error) {
                System.out.println("Hasil: " + hasil);
            }
        }

        input.close();
    }
}
