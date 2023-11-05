/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viva1;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Viva1Q4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        String password;
        
        System.out.print("Enter a string: ");
        password = s.nextLine();
        
        boolean containLowerCase = false;
        boolean containUpperCase = false;
        boolean containSpecialChar = false;
        boolean containDigit = false;
        
        String specialChars = "!@#$%^&*()-+";
        char currentChar;
        
        for (int i =0; i < password.length(); i++) {
            currentChar = password.charAt(i);
            if (Character.isLowerCase(currentChar)) {
                containLowerCase = true; 
            }
            else if (Character.isUpperCase(currentChar)) {
                containUpperCase = true;
            }
            else if (specialChars.contains(String.valueOf(currentChar))) {
                containSpecialChar = true;
            }
            else if (Character.isDigit(currentChar)) {
                containDigit = true;
            }
        }
        
        if (containLowerCase && containUpperCase && containSpecialChar && containDigit && password.length() >= 8) {
                System.out.println("Strength of password: Strong");
            }
            else if (containLowerCase && containUpperCase && containSpecialChar && password.length() >= 6) {
                System.out.println("Strength of password: Moderate");
            }
            else {
                System.out.println("Strength of password: Weak");
            }
    }
    
}
