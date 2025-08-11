package Assignment1;

import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char continueChoice;

        do {
            System.out.println("********** MENU **********");
            System.out.println("1. Print Table of a Number");
            System.out.println("2. Calculate Factorial");
            System.out.println("3. Check Prime Number");
            System.out.println("4. Print Fibonacci Series");
            System.out.println("5. Exit");
            System.out.println("**************************");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the number: ");
                    int num = scanner.nextInt();
                    for (int i = 1; i <= 10; i++) {
                        System.out.println(num + " x " + i + " = " + (num * i));
                    }
                    break;

                case 2:
                    System.out.print("Enter the number: ");
                    int factNum = scanner.nextInt();
                    long factorial = 1;
                    for (int i = 1; i <= factNum; i++) {
                        factorial *= i;
                    }
                    System.out.println("Factorial: " + factorial);
                    break;

                case 3:
                    System.out.print("Enter the number: ");
                    int primeNum = scanner.nextInt();
                    boolean isPrime = true;
                    int i = 2;
                    while (i <= primeNum / 2) {
                        if (primeNum % i == 0) {
                            isPrime = false;
                            break;
                        }
                        i++;
                    }
                    System.out.println(primeNum + (isPrime ? " is Prime" : " is Not Prime"));
                    break;

                case 4:
                    System.out.print("Enter number of terms: ");
                    int terms = scanner.nextInt();
                    int a = 0, b = 1;
                    System.out.print("Fibonacci: " + a + " " + b);
                    for (int j = 2; j < terms; j++) {
                        int c = a + b;
                        System.out.print(" " + c);
                        a = b;
                        b = c;
                    }
                    System.out.println();
                    break;

                case 5:
                    System.out.println("Exiting program...");
                    return;

                default:
                    System.out.println("Invalid choice!");
            }

            System.out.print("Back to Menu? (Y/N): ");
            continueChoice = scanner.next().charAt(0);

        } while (continueChoice == 'Y' || continueChoice == 'y');
    }
}
