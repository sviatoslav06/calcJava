package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num1, num2;
        float res;
        char symbol;
        Scanner input = new Scanner(System.in);
        boolean q = true;
        while (q) {
            System.out.println("Enter first number: ");
            ;
            num1 = input.nextInt();
            System.out.println("Enter second number: ");
            num2 = input.nextInt();
            System.out.println("Enter what you want to do with this numbers(+,-,*,/): ");
            symbol = input.next().charAt(0);
            switch (symbol) {
                case '+':
                    System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                    break;
                case '-':
                    System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                    break;
                case '*':
                    System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
                    break;
                case '/':
                    if (num2 == 0) {
                        System.out.println("I can not divide by zero!!!");
                        break;
                    }
                    System.out.println(num1 + " / " + num2 + " = " + ((float)num1 / (float)num2));
                    break;
                default:
                    System.out.println("Something went wrong...");
            }
            System.out.println("Do you want to continue(1/0)?");
            int go = input.nextInt();
            if (go == 1)
                q = true;
            else if (go == 0)
                q = false;
            else
                System.out.println("Something went wrong...");
        }
        System.out.println("Good byeeeee!!!");
    }
}
