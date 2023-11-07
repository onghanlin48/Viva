/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.viva;

/**
 *
 * @author User
 */
public class Q1 {

    public static void main(String[] args) {
        int n = 5;  // Number of rows

        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }

            // Print decreasing numbers from i to 1
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }

            // Print increasing numbers from 2 to i
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }

            // Move to the next line for the next row
            System.out.println();
        }
    }
}
