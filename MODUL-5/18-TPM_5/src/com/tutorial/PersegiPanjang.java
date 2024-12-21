package com.tutorial;

public class PersegiPanjang extends BangunDatar {
    private float panjang;
    private float lebar;

    public PersegiPanjang(float panjang, float lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    //@Override
    public float luas() {
        return panjang * lebar;
    }

    //@Override
    public float keliling() {
        return 2 * (panjang + lebar);
    }
}

    

