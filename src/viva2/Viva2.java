package viva2;

import java.util.Scanner;

public class Viva2 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the password: ");
        String password = s.next();
        if (has8Characters(password) && hasCapital(password) && hasSmall(password) && has3Digits(password) && has1Special(password)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    static boolean has8Characters(String input) {
        if (input.length() >= 8) {
            return true;
        } else {
            return false;
        }
    }

    static boolean hasCapital(String input) {
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isUpperCase(c)) {
                return true;
            }
        }
        return false;
    }

    static boolean hasSmall(String input) {
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isLowerCase(c)) {
                return true;
            }
        }
        return false;
    }

    static boolean has3Digits(String input) {
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isDigit(c)) {
                count++;
            }
        }
        if (count >= 3) {
            return true;
        }
        return false;
    }

    static boolean has1Special(String input) {
        int count = 0;
        String specialChar = "!@#$%^&*()";
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (specialChar.contains(String.valueOf(c))) {
                count++;
            }
        }
        if (count == 1) {
            return true;
        }
        return false;
    }

}
