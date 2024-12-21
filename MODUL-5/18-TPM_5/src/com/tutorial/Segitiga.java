package com.tutorial;

public class Segitiga extends BangunDatar {
    private float alas;
    private float tinggi;

    public Segitiga(float alas, float tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    //@Override
    public float luas() {
        return 0.5f * alas * tinggi;
    }

    //@Override
    public float keliling() {
        // Menggunakan rumus Heron
        float s = (float) (alas + tinggi + Math.sqrt(alas * alas + tinggi * tinggi)) / 2;
        return s;
    }
}


    

