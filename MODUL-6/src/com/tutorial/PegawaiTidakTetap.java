package com.tutorial;

public class PegawaiTidakTetap extends Pegawai{
    private static final double PERSENTASE_LEMBUR = 0.05;
    private double gajiBersih;

    public PegawaiTidakTetap(String nama, double gajiPokok) {
        super(nama, gajiPokok);
        this.gajiBersih = 0; // Gaji bersih akan dihitung
    }

    public double hitungLembur(int jamLembur) {
        return jamLembur * gajiPokok * PERSENTASE_LEMBUR;
    }

    public void hitungGajiBersih(int jamLembur) {
        double lembur = hitungLembur(jamLembur);
        this.gajiBersih = gajiPokok + lembur;
    }

    public double getGajiBersih() {
        return gajiBersih;
    }
    
}
