package com.stefano.ooplab.sesi4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;

        while(true) {
            System.out.print("Jumlah kota: ");
            try {
                n = input.nextInt();
                input.nextLine();
            }
            catch (Exception e) {
                input.nextLine();
                continue;
            }
            break;
        }

        String[] cityName = new String[n];

        for(int i=0; i<n; ++i) {
            System.out.print("Nama kota ke-" + (i+1) + ": ");
            cityName[i] = input.nextLine();
        }

        for(int i=0; i<n; ++i) {
            for(int j=i+1; j<n; ++j) {
                if(cityName[i].compareToIgnoreCase(cityName[j]) > 0) {
                    String temp = cityName[i];
                    cityName[i] = cityName[j];
                    cityName[j] = temp;
                }
            }
        }

        System.out.println("\nNama-nama kota sesuai urutan abjad: ");
        for(int i=0; i<n; ++i) {
            System.out.println(cityName[i]);
        }

    }
}
