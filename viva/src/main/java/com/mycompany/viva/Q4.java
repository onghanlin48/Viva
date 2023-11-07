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
public class Q4 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String password = scanner.nextLine();

        String strength = checkPasswordStrength(password);
        
        System.out.println("Strength of password: " + strength);
    }
    public static String checkPasswordStrength(String password) {
        boolean hasLower = false;
        boolean hasUpper = false;
        boolean hasSpecial = false;
        boolean hasDigit = false;

        if (password.length() <= 8) {
            return "Weak";
        }

        for (char ch : password.toCharArray()) {
            if (Character.isLowerCase(ch)) {
                hasLower = true;
            } else if (Character.isUpperCase(ch)) {
                hasUpper = true;
            } else if ("!@#$%^&*()-+".contains(String.valueOf(ch))) {
                hasSpecial = true;
            } else if (Character.isDigit(ch)) {
                hasDigit = true;
            }
        }

        if (hasLower && hasUpper && hasSpecial && hasDigit) {
            return "Strong";
        } else {
            return "Weak";
        }
    }
    
}
