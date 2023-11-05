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
public class VIVA1Q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String string = input.nextLine();
        int length = string.length();
        
        
        boolean Strong = false;
        boolean Moderate = false;
        
        boolean lowercase = false;
        boolean uppercase = false;
        boolean specialCharacter = false;
        boolean digit = false;
        
        
            for ( int i = 0 ; i < length ; i ++){
                    char password = string.charAt(i);
                    if ( password >= 'a' && password <= 'z'){
                        lowercase = true;
                    }
                    else if (password >= 'A' && password <= 'Z'){
                         uppercase = true;  
                    }
                    else if ( hasSpecialCharacter (password)){
                         specialCharacter = true;
                    }
                    else if (password >= '0' && password <= '9'){
                         digit =true;
                    }
                }   
                                    
            if (length>= 8 && lowercase && uppercase && specialCharacter && digit ){
                          Strong = true;
                    }
                    if (length >=6 && lowercase && uppercase && specialCharacter){
                          Moderate = true ;
                    }
               
                    if (Strong){
                      System.out.println("Strength of password : Strong " );  
                    } 
                    else if (Moderate){
                        System.out.println("Strength of password : Moderate ");
                    }
                    else {
                        System.out.println("Strength of password : Weak ");
                    }
                    
          }              
                 private static boolean hasSpecialCharacter( char password ){
                        switch (password){
                            case'!':
                            case'@':
                            case'#':
                            case'$':
                            case'%':
                            case'^':
                            case'&':
                            case'*':
                            case'(':
                            case')':
                            case'-':
                            case'+':
                               return true;
                                 default:
                               return false;      
                        }
                    }
            
        
      
}
