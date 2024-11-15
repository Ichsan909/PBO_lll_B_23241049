import java.util.Scanner;

public class HitungGajiBersih {
    // Data member atau variabel instan
    private int gajiPokok;
    private int tunjangan;
    private double pajak; // dalam persen

    // Setter dan Getter untuk gajiPokok
    public void setGajiPokok(int gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    public int getGajiPokok() {
        return this.gajiPokok;
    }

    // Setter dan Getter untuk tunjangan
    public void setTunjangan(int tunjangan) {
        this.tunjangan = tunjangan;
    }

    public int getTunjangan() {
        return this.tunjangan;
    }

    // Setter dan Getter untuk pajak
    public void setPajak(double pajak) {
        this.pajak = pajak;
    }

    public double getPajak() {
        return this.pajak;
    }

    // Method untuk menghitung dan mencetak gaji bersih
    public void cetakGajiBersih() {
        double totalGaji = gajiPokok + tunjangan;
        double potonganPajak = totalGaji * (pajak / 100);
        double gajiBersih = totalGaji - potonganPajak;

        System.out.println("Gaji Bersih: " + gajiBersih + " rupiah");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HitungGajiBersih hitung = new HitungGajiBersih();

        // Meminta input dari pengguna untuk gaji pokok
        System.out.print("Masukkan Gaji Pokok: ");
        int gajiPokok = input.nextInt();
        hitung.setGajiPokok(gajiPokok);

        // Meminta input dari pengguna untuk tunjangan
        System.out.print("Masukkan Tunjangan: ");
        int tunjangan = input.nextInt();
        hitung.setTunjangan(tunjangan);

        // Meminta input dari pengguna untuk pajak
        System.out.print("Masukkan Pajak (dalam persen): ");
        double pajak = input.nextDouble();
        hitung.setPajak(pajak);

        // Menghitung dan mencetak gaji bersih
        hitung.cetakGajiBersih();

        input.close();
    }
}
