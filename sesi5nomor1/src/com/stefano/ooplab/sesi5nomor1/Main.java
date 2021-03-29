package com.stefano.ooplab.sesi5nomor1;

public class Main {

    public static void main(String[] args) {
        Tabung obj1 = new Tabung(5, 10);
        Tabung obj2 = new Tabung(7.5, 15.5);

        System.out.println("Object pertama:\t\t\t\t\t\tObject kedua:");
        System.out.println(" radius = " + obj1.radius + "\t\t\t\t\t\t radius = " + obj2.radius);
        System.out.println(" tinggi = " + obj1.tinggi + "\t\t\t\t\t\t tinggi = " + obj2.tinggi);
        System.out.println(" luas alas = " + obj1.getLuasAlas() + "\t\t luas alas = " + obj2.getLuasAlas());
        System.out.println(" volume = " + obj1.getVolume()  + "\t\t\t volume = " + obj2.getVolume());
    }
}
