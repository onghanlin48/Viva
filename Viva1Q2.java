package viva1;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class Viva1Q2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int number;
        
        System.out.print("Enter an integer: ");
        number = s.nextInt();
        
        int reversedNumber = 0;
        int digit;
        
        while (number != 0) {
            digit = number%10;
            reversedNumber = reversedNumber*10 + digit;
            number /= 10;
        }
        System.out.println("Reversed integer: " + reversedNumber);
    }
    
}
