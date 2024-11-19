// Class Hitung_Gaji_Bersih
class Hitung_Gaji_Bersih {
    // Atribut private
    private int gajiPokok;
    private int tunjangan;
    private double pajak; // dalam persen

    // Setter untuk atribut
    public void setGajiPokok(int gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    public void setTunjangan(int tunjangan) {
        this.tunjangan = tunjangan;
    }

    public void setPajak(double pajak) {
        this.pajak = pajak;
    }

    // Getter untuk atribut
    public int getGajiPokok() {
        return gajiPokok;
    }

    public int getTunjangan() {
        return tunjangan;
    }

    public double getPajak() {
        return pajak;
    }
  // Method untuk menghitung gaji bersih
  public double hitungGajiBersih() {
    double totalGaji = gajiPokok + tunjangan;
    double potonganPajak = totalGaji * (pajak / 100);
    return totalGaji - potonganPajak;
}
}

// Class utama
public class App {
public static void main(String[] args) {
    // Membuat objek dari class Hitung_Gaji_Bersih
    Hitung_Gaji_Bersih gaji = new Hitung_Gaji_Bersih();

    // Input data menggunakan setter
    gaji.setGajiPokok(9000000);  // Gaji pokok
    gaji.setTunjangan(2000000); // Tunjangan
    gaji.setPajak(10);          // Pajak dalam persen

    
    // Output hanya gaji bersih
    System.out.println("Gaji Bersih: Rp " + gaji.hitungGajiBersih());
    
}
}