/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.viva;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an integer: ");
        int number = scanner.nextInt();

        int reversedNumber = reverseInteger(number);

        System.out.println("Reversed integer: " + reversedNumber);
    }
    public static int reverseInteger(int number) {
        int reversed = 0;
        boolean isNegative = false;

        if (number < 0) {
            isNegative = true;
            number = -number;  // Make the number positive for reversal
        }

        while (number > 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }

        if (isNegative) {
            reversed = -reversed;  // If the original number was negative, make the reversed number negative
        }

        return reversed;
    }
}
