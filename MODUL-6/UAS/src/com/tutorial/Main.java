package com.tutorial;

public class Main {
    public static void main(String[] args) {
        Pegawai[] daftarPegawai = new Pegawai[50];

        // Membuat 25 pegawai tetap
        for (int i = 0; i < 25; i++) {
            daftarPegawai[i] = new PegawaiTetap("Pegawai Tetap " + (i + 1), 2000000);
        }

        // Membuat 25 pegawai tidak tetap
        for (int i = 25; i < 50; i++) {
            daftarPegawai[i] = new PegawaiTidakTetap("Pegawai Tidak Tetap " + (i - 24), 1000000);
        }

        // Menampilkan hanya satu pegawai tetap
        System.out.println("=== Pegawai Tetap ===");
        for (Pegawai pegawai : daftarPegawai) {
            if (pegawai instanceof PegawaiTetap) {
                PegawaiTetap tetap = (PegawaiTetap) pegawai;
                int jamLembur = (int) (Math.random() * 11); // Jam lembur random antara 0-10 jam
                tetap.hitungGajiBersih(jamLembur);
                System.out.println("Nama: " + tetap.getNama());
                System.out.println("Gaji Pokok: " + tetap.getGajiPokok());
                System.out.println("Tunjangan: " + tetap.getTunjangan());
                System.out.println("Durasi Lembur: " + jamLembur);
                System.out.println("Gaji Bersih: " + tetap.getGajiBersih());
                break; // Keluar dari loop setelah satu pegawai tetap
            }
        }

        // Menampilkan hanya satu pegawai tidak tetap
        System.out.println("\n=== Pegawai Tidak Tetap ===");
        for (Pegawai pegawai : daftarPegawai) {
            if (pegawai instanceof PegawaiTidakTetap) {
                PegawaiTidakTetap tidakTetap = (PegawaiTidakTetap) pegawai;
                int jamLembur = (int) (Math.random() * 11); // Jam lembur random antara 0-10 jam
                tidakTetap.hitungGajiBersih(jamLembur);
                System.out.println("Nama: " + tidakTetap.getNama());
                System.out.println("Gaji Pokok: " + tidakTetap.getGajiPokok());
                System.out.println("Durasi Lembur: " + jamLembur);
                System.out.println("Gaji Bersih: " + tidakTetap.getGajiBersih());
                break; // Keluar dari loop setelah satu pegawai tidak tetap
            }
        }
    }
    
}
