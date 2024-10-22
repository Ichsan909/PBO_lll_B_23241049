class Mahasiswa {
    // data member atau ciri
    String nama;
    String NIM;

    // constructor
    Mahasiswa(String nama, String NIM) {
        this.nama = nama; 
        this.NIM = NIM; 
    }

    // method tanpa return
    void cetak() {
        System.out.println("Nama : " + this.nama);
        System.out.println("NIM : " + this.NIM);
    }

    // method untuk mengubah nama
    void setNama(String nama) {
        this.nama = nama;
    }
    //method dengan return dan tanpa parameter
    String getNama (){
        return this.nama;
    }
    String getNIM (){
        return this.NIM;

    
    }
    //method dengan parameter dan return
    String sayHI(String pesan){
        return "HAiiiiiiii" + this.nama + pesan;
    }
}

public class App {
    public static void main(String[] args) {
        // membuat objek dengan nilai yang sesuai
        Mahasiswa mhs_1 = new Mahasiswa("Budi", "123456789");
        mhs_1.cetak(); // Panggil method cetak untuk menampilkan data

        // memanggil method setNama dengan argumen yang benar
        mhs_1.setNama("ucup");
        mhs_1.cetak(); // Menampilkan data setelah diubah


        System.out.println(mhs_1.getNama());
        System.out.println(mhs_1.getNIM());

        //memanggil method dengan parameter dan return
        String pesan = mhs_1.sayHI("sukses belajar oop");
        System.out.println(pesan);
    }
}
