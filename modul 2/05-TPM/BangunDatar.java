import java.util.Scanner;

public class BangunDatar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pilih bangun datar:");
        System.out.println("1. Persegi Panjang");
        System.out.println("2. Persegi");
        System.out.println("3. Lingkaran");
        System.out.print("Masukkan pilihan: ");

        int pilihan = scanner.nextInt();

        switch (pilihan) {
            case 1:
                persegiPanjang(scanner);
                break;
            case 2:
                persegi(scanner);
                break;
            case 3:
                lingkaran(scanner);
                break;
            default:
                System.out.println("Pilihan tidak valid.");
        }

        scanner.close();
    }

    static void persegiPanjang(Scanner scanner) {
        System.out.print("Masukkan panjang: ");
        double panjang = scanner.nextDouble();

        System.out.print("Masukkan lebar: ");
        double lebar = scanner.nextDouble();

        double luas = panjang * lebar;
        double keliling = 2 * (panjang + lebar);

        System.out.println("Luas Persegi Panjang: " + luas);
        System.out.println("Keliling Persegi Panjang: " + keliling);
    }

    static void persegi(Scanner scanner) {
        System.out.print("Masukkan sisi: ");
        double sisi = scanner.nextDouble();

        double luas = sisi * sisi;
        double keliling = 4 * sisi;

        System.out.println("Luas Persegi: " + luas);
        System.out.println("Keliling Persegi: " + keliling);
    }

    static void lingkaran(Scanner scanner) {
        System.out.print("Masukkan jari-jari: ");
        double jariJari = scanner.nextDouble();

        double luas = Math.PI * jariJari * jariJari;
        double keliling = 2 * Math.PI * jariJari;

        System.out.println("Luas Lingkaran: " + luas);
        System.out.println("Keliling Lingkaran: " + keliling);
    }
}