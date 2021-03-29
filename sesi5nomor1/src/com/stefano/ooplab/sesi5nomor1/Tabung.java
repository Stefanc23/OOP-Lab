package com.stefano.ooplab.sesi5nomor1;

public class Tabung {
    double radius, tinggi;

    Tabung() {
        radius = 1;
        tinggi = 1;
    }

    Tabung(double r, double t) {
        radius = r;
        tinggi = t;
    }

    public double getVolume() {
        return getLuasAlas() * tinggi;
    }

    public double getLuasAlas() {
        return Math.PI * Math.pow(radius, 2);
    }

    public void setRadius(double r) {
        radius = r;
    }

    public void setTinggi(double t) {
        tinggi = t;
    }

}
