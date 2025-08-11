package Assignment2;

import java.util.Scanner;

class StringUtility {

    int countVowels(String str) {
        int count = 0;
        for (char ch : str.toLowerCase().toCharArray()) {
            if ("aeiou".indexOf(ch) != -1) count++;
        }
        return count;
    }

    int countConsonants(String str) {
        int count = 0;
        for (char ch : str.toLowerCase().toCharArray()) {
            if (Character.isLetter(ch) && "aeiou".indexOf(ch) == -1) count++;
        }
        return count;
    }

    boolean isPalindrome(String str) {
        String cleanStr = str.replaceAll("\\s+", "").toLowerCase();
        return cleanStr.equals(new StringBuilder(cleanStr).reverse().toString());
    }

    String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    String toUpperCase(String str) {
        return str.toUpperCase();
    }

    String toLowerCase(String str) {
        return str.toLowerCase();
    }

    String replaceWord(String str, String oldWord, String newWord) {
        return str.replace(oldWord, newWord);
    }
}

public class Assignment2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringUtility util = new StringUtility();

        System.out.print("Enter a string: ");
        String inputStr = sc.nextLine();

        int choice;
        do {
            System.out.println("\n********** STRING MENU **********");
            System.out.println("1. Count Vowels and Consonants");
            System.out.println("2. Check Palindrome");
            System.out.println("3. Reverse String");
            System.out.println("4. Convert to Uppercase and Lowercase");
            System.out.println("5. Replace a Word");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.println("Vowels: " + util.countVowels(inputStr));
                    System.out.println("Consonants: " + util.countConsonants(inputStr));
                    break;

                case 2:
                    System.out.println("Palindrome? " + util.isPalindrome(inputStr));
                    break;

                case 3:
                    System.out.println("Reversed: " + util.reverseString(inputStr));
                    break;

                case 4:
                    System.out.println("Uppercase: " + util.toUpperCase(inputStr));
                    System.out.println("Lowercase: " + util.toLowerCase(inputStr));
                    break;

                case 5:
                    System.out.print("Enter word to replace: ");
                    String oldWord = sc.nextLine();
                    System.out.print("Enter new word: ");
                    String newWord = sc.nextLine();
                    inputStr = util.replaceWord(inputStr, oldWord, newWord);
                    System.out.println("Updated String: " + inputStr);
                    break;

                case 6:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 6);
    }
}
