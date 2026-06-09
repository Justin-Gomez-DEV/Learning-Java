package Codedex;

import java.util.Scanner;
import java.util.Random;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        Random rand = new Random();

        System.out.print("Enter a number from 0-10: ");
        int num = scanner.nextInt();

        int guess = rand.nextInt(11);

        if(guess == num) {
            System.out.println("The computer guessed right");
        } else {
            System.out.println("The computer guessed wrong");
        }
    }
}
