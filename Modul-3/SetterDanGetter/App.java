class Data {
    // Data member atau variabel instan
    public int intPublic;
    private int intPrivate;
    private double doublePrivate;

    // Constructor dengan modifier public
    public Data() {
        this.intPublic = 0;
        this.intPrivate = 100;
        this.doublePrivate = 0.0; // Inisialisasi default untuk doublePrivate
    }

    // Getter untuk intPrivate
    public int getIntPrivate() {
        return this.intPrivate;
    }

    // Getter dan Setter untuk doublePrivate
    public double getDoublePrivate() {
        return this.doublePrivate;
    }

    public void setDoublePrivate(double value) {
        this.doublePrivate = value;
    }
}

public class App {
    public static void main(String[] args) {
        // Instansi objek
        Data objek = new Data();

        // Menulis dan membaca variabel public
        objek.intPublic = 5;
        // Baca
        System.out.println("Public : " + objek.intPublic);

        // Membaca variabel private menggunakan getter
        int angka = objek.getIntPrivate();
        System.out.println("Getter intPrivate: " + angka);

        // Menulis dan membaca doublePrivate menggunakan setter dan getter
        objek.setDoublePrivate(50.25);
        System.out.println("Getter doublePrivate: " + objek.getDoublePrivate());
    }
}
