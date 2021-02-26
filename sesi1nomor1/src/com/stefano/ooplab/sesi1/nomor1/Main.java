package com.stefano.ooplab.sesi1.nomor1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
		int seconds;

		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an integer for seconds: ");
		seconds = input.nextInt();

		System.out.print(seconds + " seconds is ");
		if(seconds >= 86400) {
			System.out.print(seconds / 86400 + " days ");
			if(seconds % 86400 >= 3600) System.out.print("and " + (seconds % 86400) / 3600 + " hours ");
			if((seconds % 86400) % 3600 >= 60) System.out.print("and " + ((seconds % 86400) % 3600) / 60 + " minutes ");
			if(((seconds % 86400) % 3600) % 60 > 0) System.out.print("and " + ((seconds % 86400) % 3600) % 60 + " seconds");
		}
		else if(seconds >= 3600) {
			System.out.print(seconds / 3600 + " hours ");
			if(seconds % 3600 >= 60) System.out.print("and " + (seconds % 3600) / 60 + " minutes ");
			if((seconds % 3600) % 60 > 0) System.out.print("and " + ((seconds % 3600) % 60) + " seconds");
		}
		else if(seconds >= 60) {
			System.out.print((seconds % 3600) / 60 + " minutes ");
			if(seconds % 60 > 0) System.out.print("and " + ((seconds % 3600) % 60) + " seconds");
		}
		else {
			System.out.print(((seconds % 3600) % 60) + " seconds");
		}
    }
}
