package com.tutorial;

public class PegawaiTetap extends Pegawai{
    private static final double PERSENTASE_TUNJANGAN = 0.7;
    private static final double PERSENTASE_LEMBUR = 0.1;
    private double tunjangan;
    private double gajiBersih;

    public PegawaiTetap(String nama, double gajiPokok) {
        super(nama, gajiPokok);
        this.tunjangan = gajiPokok * PERSENTASE_TUNJANGAN;
        this.gajiBersih = 0; // Gaji bersih akan dihitung
    }

    public void setTunjangan(double tunjangan) {
        this.tunjangan = tunjangan;
    }

    public double hitungLembur(int jamLembur) {
        return jamLembur * gajiPokok * PERSENTASE_LEMBUR;
    }

    public void hitungGajiBersih(int jamLembur) {
        double lembur = hitungLembur(jamLembur);
        this.gajiBersih = gajiPokok + tunjangan + lembur;
    }

    public double getTunjangan() {
        return tunjangan;
    }

    public double getGajiBersih() {
        return gajiBersih;
    }
}
