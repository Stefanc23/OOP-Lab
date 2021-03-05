package com.stefano.ooplab.sesi2;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;

public class Main {

    public static String validateLottery(String inputNumber, String winningNumber) {
        if(inputNumber.equals(winningNumber)) return "$10.000";
        int numberOfMatchingDigits = 0;
        char foundMatchingDigit = ' ';
        if(inputNumber.charAt(0) == winningNumber.charAt(0) || inputNumber.charAt(0) == winningNumber.charAt(1)) {
            numberOfMatchingDigits++;
            foundMatchingDigit = inputNumber.charAt(0);
        }
        if((inputNumber.charAt(1) == winningNumber.charAt(0) || inputNumber.charAt(1) == winningNumber.charAt(1)) && foundMatchingDigit != inputNumber.charAt(1)) {
            numberOfMatchingDigits++;
        }
        if(numberOfMatchingDigits == 2) return "$3.000";
        if(numberOfMatchingDigits == 1) return "$1.000";
        return null;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        String winningNumber = String.format("%d%d", rand.nextInt(10), rand.nextInt(10));
        String inputNumber, prize;

        int number = 0;
        do {
            System.out.print("\nAngka anda [0-99]: ");
            try {
                number = input.nextInt();
            }
            catch(InputMismatchException ime) {
                input.nextLine();
                continue;
            }
            if(number >= 0 && number < 99) break;
        }
        while(true);
        inputNumber = number >= 10 ? String.valueOf(number) : String.format("0%d", number);

        prize = validateLottery(inputNumber, winningNumber);
        if(prize != null) {
            System.out.println("Selamat! Anda memenangkan hadiah senilai " + prize);
        }
        else {
            System.out.println("Anda kurang beruntung");
        }
        System.out.println("Angka anda: " + inputNumber+ "; Angka lotere: " + winningNumber);
    }
}
