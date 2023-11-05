/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viva1;

/**
 *
 * @author Huawei
 */
public class VIVA1Q1 {
    public static void main(String[] args) {
        int number_of_lines = 5;
        
        for (int rows = 1; rows <= number_of_lines; rows ++){
            for (int s = number_of_lines - rows; s >=1 ; s--){
                System.out.print(" ");
            }
            for (int l = rows; l >= 2 ; l--){
                System.out.print(l);
            }
            for (int r = 1; r<=rows; r++ ){
                System.out.print(r);
            }
            System.out.println();
        }
    }
 
}
