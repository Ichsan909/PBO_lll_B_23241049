class Mahasiswa {
    // Membuat atribut ciri-ciri object
    String nama;
    String NIM;
    String prodi;
    double IPK;
    int umur;
}

public class App {
    public static void main(String[] args) {
       // Instansiasi object
       Mahasiswa mhs_1 = new Mahasiswa();
       // Mahasiswa 2
       Mahasiswa mhs_2 = new Mahasiswa();
       // Pengisian data object
       mhs_1.nama = "Ucup";
       mhs_1.NIM = "1234354";
       mhs_1.prodi = "PTI";
       mhs_1.IPK = 2.21;
       mhs_1.umur = 35;

       // Cetak data mahasiswa 1
       System.out.println("Nama mahasiswa : " + mhs_1.nama);
       System.out.println("NIM : " + mhs_1.NIM);
       System.out.println("Prodi : " + mhs_1.prodi);
       System.out.println("IPK : " + mhs_1.IPK);
       System.out.println("Umur : " + mhs_1.umur);

       

       // Pengisian data mahasiswa 2
       mhs_2.nama = "Ichsan";
       mhs_2.NIM = "23241049";
       mhs_2.prodi = "PTI";
       mhs_2.IPK = 3.25;
       mhs_2.umur = 20;

       // Cetak data mahasiswa 2
       System.out.println("Nama mahasiswa : " + mhs_2.nama);
       System.out.println("NIM : " + mhs_2.NIM);
       System.out.println("Prodi : " + mhs_2.prodi);
       System.out.println("IPK : " + mhs_2.IPK);
       System.out.println("Umur : " + mhs_2.umur);
    }
}