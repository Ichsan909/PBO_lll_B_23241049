package com.tutorial;

public class persegi extends BangunDatar {
    private float sisi;

    public persegi(float sisi) {
        this.sisi = sisi;
    }

    //Override
    public float luas() {
        return sisi * sisi;
    }

    //Override
    public float keliling() {
        return 4 * sisi;
    }
}

    

