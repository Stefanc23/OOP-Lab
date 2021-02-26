package com.stefano.ooplab.sesi1.nomor2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int dayInputInt = 0, amount, dayResultInt;
        String dayInput;
        String[] days = {"minggu", "senin", "selasa", "rabu", "kamis", "jumat", "sabtu"};

        Scanner input = new Scanner(System.in);
	    
	    System.out.print("Masukan nama hari ini: ");
	    dayInput = input.nextLine().toLowerCase();
	    System.out.print("Masukan jumlah hari berikutnya: ");
	    amount = input.nextInt();
	    
	    for(int i=0; i<days.length; ++i) {
            if(dayInput.equals(days[i])) {
                dayInputInt = i;
                break;
            }
        }

        dayResultInt = (dayInputInt + (amount % 7)) % 7;

        System.out.println("Jika hari ini adalah " + dayInput + ", maka " + amount + " hari berikutnya adalah hari " + days[dayResultInt]);
    }
}