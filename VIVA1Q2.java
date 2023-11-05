/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viva1;

/**
 * @author Huawei
 */
import java.util.Scanner;
public class VIVA1Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer : ");
        int oriNumber = input.nextInt();
        int reversed =0 ;
        boolean isNegative = false;
        
        if (oriNumber <0){
            isNegative = true;
            oriNumber = -oriNumber;
        }
        
        
        while ( oriNumber != 0){
            int digit = oriNumber % 10;
            reversed =reversed * 10 + digit;
            oriNumber /= 10;
           }
        
        if( isNegative) {
            reversed = -reversed;
        }
        
        System.out.println("Reversed integer : " + reversed);
        
    }
}
