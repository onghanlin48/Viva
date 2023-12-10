/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week9;

/**
 *
 * @author Huawei
 */
import java.util.Scanner;
public class VIVA2Q1 {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.println("Enter your password : ");
        String password= input.nextLine();
        System.out.println(isValidPassword(password));
    }
    public static boolean isValidPassword(String password){
        //Rule 1
        if(password.length()<8){
            return false;
        }
        // Loop through each character in the password
        int lowercaseCount=0;
        int uppercaseCount=0;
        int digitCount=0;
        int specialcharCount=0;
        String specialChar = "!@#$%^&*()_+-=[]{};':\"\\|,.<>?/";
        for(char c : password.toCharArray()){
            if(Character.isLowerCase(c)){
                lowercaseCount++;
            }
            else if(Character.isUpperCase(c)){
                uppercaseCount++;
            }
            else if(Character.isDigit(c)){
                digitCount++;
            }
            else if (specialChar.contains(String.valueOf(c))){
                specialcharCount++;
            }
        }
        
        //Rule 2
        if (lowercaseCount < 1 || uppercaseCount < 1) {
            return false;
        }

        // Rule 3
        if (digitCount < 3) {
            return false;
        }

        // Rule 4
        if (specialcharCount != 1) {
            return false;
        }

        return true;
    } 
    
}
