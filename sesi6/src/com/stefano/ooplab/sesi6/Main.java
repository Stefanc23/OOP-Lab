package com.stefano.ooplab.sesi6;

public class Main {

    public static void main(String[] args) {
        int numberOfStudents = 8, numberOfQuestions = 10;
	    char[][] scoreTable = {
                {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
                {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
                {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
                {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}
        };
        char[] answerSheet = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};
        int[] result = new int[numberOfStudents];

        for(int i=0; i<numberOfStudents; ++i) {
            int numberOfCorrectAnswers = 0;
            for(int j=0; j<numberOfQuestions; ++j) {
                if(scoreTable[i][j] == answerSheet[j]) numberOfCorrectAnswers++;
            }
            result[i] = numberOfCorrectAnswers;
        }

        for(int i=0; i<numberOfStudents; ++i) {
            System.out.println("Mhs " + i + " jumlah jawaban benar adalah " + result[i]);
        }
    }
}
