/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viva1;

/**
 *
 * @author Huawei
 */
import java.util.Scanner;
public class VIVA1Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = input.nextInt();
        int sumOfFactorial = 0;
        int oriNum = number;
        
        
        while (number > 0){
            int digit = number % 10;
            sumOfFactorial += factorial(digit);
            number /= 10;
        }
        if (sumOfFactorial == oriNum){
            System.out.println(oriNum + " is a Strong Number "); 
            
        }
        else {
            System.out.println(oriNum + " is not a Strong Number ");
        }
       
    }
    private static int factorial(int n){
        
        if ( n == 0 || n == 1){
            return 1;
        }
        int answer = 1 ;
        for ( int i =2 ; i <= n; i++){
            answer *= i;
            
        }
         return answer;       
    }
}
