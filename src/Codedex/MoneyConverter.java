package Codedex;

import java.util.Scanner;

public class MoneyConverter {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter amount of coins: ");
        double coins = scanner.nextDouble();

        double USD = coins * 0.0045;

        System.out.println(USD);

        scanner.close();
    }
}
