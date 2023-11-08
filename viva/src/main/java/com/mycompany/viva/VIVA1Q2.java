/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viva1;

import java.util.Scanner;
public class VIVA1Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer : ");
        int number = input.nextInt();
        int reversedNumber =0 ;
        boolean isNegative = false;
        
        if (number <0){
            isNegative = true;
            number = -number;
        }
        
        
        while ( number != 0){
            int digit = number % 10;
            reversedNumber =reversedNumber * 10 + digit;
            number /= 10;
           }
        
        if( isNegative) {
            reversedNumber = -reversedNumber;
        }
        
        System.out.println("Reversed integer : " + reversedNumber);
        
    }
}
