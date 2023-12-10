/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package viva2;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Viva2 {


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter your password: ");
        String password = s.nextLine();
        
        System.out.println("Your password is valid: " + checkPasswordValidity(password));
    }
    
    public static boolean checkPasswordValidity(String pw) {
        boolean containCapitalLetter = false;
        boolean containSmallLetter = false;
        boolean containSpecialChar = false;
        boolean containDigit = false;
        
        String specialChars = ".*[`~!@#$%^&*()\\\\-_=+\\\\\\\\|\\\\[{\\\\]};:'\\\",<.>/?].*";
        char currentChar;
        int count1 = 0;
        int count2 = 0;
        
        for (int i = 0; i < pw.length(); i++) {
            currentChar = pw.charAt(i);
            if (Character.isUpperCase(currentChar)) {
                containCapitalLetter = true;
            } else if (Character.isLowerCase(currentChar)) {
                containSmallLetter = true;
            } else if (Character.isDigit(currentChar)) {
                containDigit = true;
                count1++;
            } else if (specialChars.contains(String.valueOf(currentChar))) {
                containSpecialChar = true;
                count2++;
            }
        }
        
        boolean isValid = false;
        
        if (pw.length()>=8 && containCapitalLetter && containSmallLetter && containDigit && count1>=3 && containSpecialChar && count2==1) {
            isValid = true;
        }
        
        return isValid;
    }
    
}
