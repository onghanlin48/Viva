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
public class Viva1Q3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int number;
        
        System.out.print("Enter a number: ");
        number = s.nextInt();
        
        int num = number;
        int digit;
        int factorial;
        int sum = 0;
        
        while (number != 0) {
            digit = number%10;
            factorial = 1;
        
            for (int i = 1;i <= digit; i++) {
            factorial *= i;
            }
            
            sum += factorial;
            number /= 10;
        }
        
        if (sum == num) {
            System.out.println(num + " is a Strong Number");
        }
        else {
            System.out.println(num + " is not a Strong Number");
        }
    }
    
}
