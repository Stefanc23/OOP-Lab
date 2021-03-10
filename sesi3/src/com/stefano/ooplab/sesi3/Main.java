package com.stefano.ooplab.sesi3;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random rand = new Random();

		int magicNumber = rand.nextInt(101);
		int guess;

		System.out.println("\nGuess a magic number between 0 and 100");
		while(true) {
			System.out.print("\n\nEnter your guess: ");
			try {
				guess = input.nextInt();
				input.nextLine();
			}
			catch(InputMismatchException ime) {
				input.nextLine();
				continue;
			}
			if(guess < 0 || guess > 100) continue;
			if(guess == magicNumber) break;
			else System.out.println("Your guess is too " + ((guess > magicNumber) ? "high" : "low"));
		}
		System.out.println("Yes, the number is " + guess);
	}
}