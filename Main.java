package app;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter your income: ");
        double income = scanner.nextDouble();

        double taxRate;

        if (income <= 10000) {
            taxRate = 2.5;
        } else  if (income <= 25000) {
            taxRate = 4.3;

        }else {
            taxRate = 6.7;

        }
        double tax = income * taxRate / 100;

        System.out.printf("Tax amount: "+ tax);

        scanner.close();

    }
}
