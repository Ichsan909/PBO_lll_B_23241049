// class Polos adalah kelas tanpa constructor
class Polos {
    // Atribut
    String dataString;
    int dataInteger;
}

// class dengan constructor
class Mahasiswa {
    // Atribut
    String nama;
    String NIM;
    String prodi;

    // Constructor
    // Namanya harus sama dengan nama class
    // Tidak memiliki return value (nilai balik)
    // Method yang pertama kali dipanggil saat objek pertama kali di-instantiasi
    Mahasiswa(String inputNama, String inputNIM, String inputProdi) {
        nama = inputNama;
        NIM = inputNIM;
        prodi = inputProdi;

        // Cetak informasi mahasiswa
        System.out.println("Nama mahasiswa  : " + nama);
        System.out.println("NIM             : " + NIM);
        System.out.println("Prodi           : " + prodi);
    }
}

public class App {
    public static void main(String[] args) {
        // Pembuatan objek (instansiasi) untuk class Polos
        Polos polos_1 = new Polos();

        // Isi atribut objek Polos
        polos_1.dataString = "polos";
        polos_1.dataInteger = 10;

        // Cetak atribut dari objek Polos
        System.out.println(polos_1.dataString);
        System.out.println(polos_1.dataInteger);

        // Pembuatan objek Mahasiswa dengan constructor
        Mahasiswa mhs_1= new Mahasiswa("Otong", "11213434", "PTI");

    }
}
