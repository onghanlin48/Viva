/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viva2;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Viva2Q3 {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter 6 numeraical values: ");
        String values = s.nextLine();
        String[] numbers = values.split(" ");
        
        System.out.print("The validity of each numbers are: ");
        getBooleanArray(numbers);
    }
    
    public static void getBooleanArray(String[] arr) {
        int size = arr.length;
        boolean[] array = new boolean[size];
        
        for (int i = 0; i < arr.length; i++) {
            array[i] = checkValidity(arr[i]);
        }
        
        System.out.print("{");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] ? "True" : "False");
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }
    
    public static boolean checkValidity(String num) {
        boolean isValid = false;
        
        if (!num.equals("null") && !num.isEmpty()) {
            int dotCount = 0;
            int eCount = 0;
            int countE = 0;
            int signCount = 0;

            for (int i = 0; i < num.length(); i++) {
                char currentChar = num.charAt(i);

                if (currentChar == '.') {
                    dotCount++;
                    if (dotCount > 1) {
                        return false; // More than one decimal point
                    }
                    if (i == 0 || i == num.length() - 1) {
                        return false; // Decimal point at the beginning or end
                    }
                    if (i > 0 && !Character.isDigit(num.charAt(i - 1)) && !Character.isDigit(num.charAt(i + 1))) {
                        return false; // Decimal point not between digits
                    }
                } else if (currentChar == 'e') {
                    eCount++;
                    if (eCount > 1 || i == 0 || i == num.length() - 1) {
                        return false; // More than one 'e' or at beginning/end
                    }
                    if (!Character.isDigit(num.charAt(i - 1)) || Character.isDigit(num.charAt(i + 1))) {
                        return false; // 'e' not preceded by digits or followed by didits
                    }
                } else if (currentChar == 'E') {
                    countE++;
                    if (countE > 1 || i == 0 || i == num.length() - 1) {
                        return false; // More than one 'E' or at beginning/end
                    }
                    if (!Character.isDigit(num.charAt(i - 1)) || !Character.isDigit(num.charAt(i + 1))) {
                        return false; // 'E' not preceded/followed by digits
                    }
                }
                else if (currentChar == '+' || currentChar == '-') {
                    signCount++;
                    if (signCount > 2 || (i != 0 && num.charAt(i - 1) != 'e')) {
                        return false; // More than two signs or signs not after 'e'
                    }
                    if (num.charAt(i + 1) == '+' || num.charAt(i + 1) == '-') {
                        return false; // +/- followed by +/-
                    }
                    if (i == num.length() - 1) {
                        return false; // Sign at the end
                    }
                    if (!Character.isDigit(num.charAt(i + 1))) {
                        return false; // +/- not followed by digits
                    }
                } else if (!Character.isDigit(currentChar)) {
                    return false; // Other characters besides digits, eg. '.', 'e', 'E', '+', '-'
                }

                isValid = true;
            }
        }
        return isValid;
        
    }
    
}
