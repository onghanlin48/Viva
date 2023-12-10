/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week9;

/**
 *
 * @author Huawei
 * */
import java.util.Scanner;
public class VIVA2Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the numbers: ");
        String inputLine = input.nextLine();
        String[] numbers = inputLine.split(",");
        printResult(numbers);
    }

    public static boolean[] validateNumbers(String[] numbers) {
        boolean[] validity = new boolean[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            validity[i] = isNumeric(numbers[i]);
        }

        return validity;
    }

    private static boolean isNumeric(String str) {
        if (str.isEmpty()) {
            return false;
        }

        boolean hasDot = false;
        boolean hasE = false;
        boolean hasSign = false;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (!Character.isDigit(ch)) {
                if (ch == '+' || ch == '-') {
                    if (hasSign || (i != 0 && str.charAt(i - 1) != 'e' && str.charAt(i - 1) != 'E')) {
                        return false;
                    }
                    hasSign = true;
                } else if (ch == '.') {
                    if (hasDot || hasE || i == 0 || i == str.length() - 1) {
                        return false;
                    }
                    hasDot = true;
                } else if (ch == 'e' || ch == 'E') {
                    if (hasE || i == 0 || i == str.length() - 1 || !Character.isDigit(str.charAt(i - 1))) {
                        return false;
                    }
                    hasE = true;
                    // Check if there are digits after 'e'
                    if (i < str.length() - 1 && (!Character.isDigit(str.charAt(i + 1)) && str.charAt(i + 1) != '+' && str.charAt(i + 1) != '-')) {
                        return false;
                    }
                } else {
                    return false; // Invalid character other than digits, '+', '-', '.', 'e', 'E'
                }
            }
        }

        return true;
    }

    public static void printResult(String[] numbers) {
        boolean[] validity = validateNumbers(numbers);

        System.out.print("{ ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(validity[i] ? "True" : "False");
            if (i < numbers.length - 1) {
                System.out.print(",");
            }
            System.out.print(" ");
        }
        System.out.println("}");
    }
}
