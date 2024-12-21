package com.tutorial;

public class lingkaran extends BangunDatar {
    private float r;

    public lingkaran (float r) {
        this.r = r;
    }

    //@Override
    public float luas() {
        return (float) Math.PI * r * r;
    }

    //@Override
    public float keliling() {
        return 2 * (float) Math.PI * r;
    }
}

    

