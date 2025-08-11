package Assignment3;

import java.util.Scanner;

class MathOperations {

    void printTable(int number) {
        System.out.println("Multiplication Table of " + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }

    void calculateFactorial(int number) {
        long fact = 1;
        for (int i = 1; i <= number; i++) {
            fact *= i;
        }
        System.out.println("Factorial of " + number + " is: " + fact);
    }

    void checkPrime(int number) {
        if (number <= 1) {
            System.out.println(number + " is NOT a Prime Number");
            return;
        }

        boolean isPrime = true;
        int i = 2;
        while (i <= number / 2) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
            i++;
        }

        System.out.println(number + (isPrime ? " is a Prime Number" : " is NOT a Prime Number"));
    }

    void printFibonacci(int terms) {
        if (terms < 1) {
            System.out.println("Please enter a positive number.");
            return;
        }

        int a = 0, b = 1;
        System.out.print("Fibonacci Series: " + a);
        if (terms > 1) {
            System.out.print(" " + b);
        }

        for (int j = 2; j < terms; j++) {
            int c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }
        System.out.println();
    }
}

public class Assignment3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MathOperations math = new MathOperations();
        int choice;

        do {
            System.out.println("\n********** MATH MENU **********");
            System.out.println("1. Print Table");
            System.out.println("2. Calculate Factorial");
            System.out.println("3. Check Prime");
            System.out.println("4. Print Fibonacci Series");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter number: ");
                    math.printTable(sc.nextInt());
                    break;

                case 2:
                    System.out.print("Enter number: ");
                    math.calculateFactorial(sc.nextInt());
                    break;

                case 3:
                    System.out.print("Enter number: ");
                    math.checkPrime(sc.nextInt());
                    break;

                case 4:
                    System.out.print("Enter number of terms: ");
                    math.printFibonacci(sc.nextInt());
                    break;

                case 5:
                    System.out.println("Exiting the program...");
                    break;

                default:
                    System.out.println("Invalid choice! Please enter between 1 to 5.");
            }

        } while (choice != 5);
    }
}
