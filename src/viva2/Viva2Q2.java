package viva2;

import java.util.Scanner;

public class Viva2Q2 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter array 1 :");
        String[] array1Input = s.nextLine().split(",");

        double[] array1 = new double[array1Input.length];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = Double.valueOf(array1Input[i]);
        }

        System.out.print("Enter Array2 : ");
        String[] array2Input = s.nextLine().split(",");

        double[] array2 = new double[array2Input.length];
        for (int i = 0; i < array2.length; i++) {
            array2[i] = Double.valueOf(array2Input[i]);
        }
        
        double [] combination =combineArray(array1, array2);
        for(int pass=1;pass<combination.length;pass++){
            for(int i =0;i<combination.length-1;i++){
                double hold = combination[i];
                if(combination[i]>combination[i+1]){
                    
                    combination [i]=combination[i+1];
                    combination[i+1]=hold;
                    
                }
            }
        }

        System.out.println("Sorted:");
        for (double value :combination){
            System.out.print(value+" ");
        }
        System.out.printf("\nThe median is %.3f",median(combination));
        System.out.println("");
    }

    public static double median(double[] input) {
        if(input.length%2==0){
            return (input[input.length/2]+(input[input.length/2-1]))/2.0;
            
        }else
            return input[input.length/2];

    }

    static double [] combineArray(double[] array1, double[] array2) {
        double[] combination = new double[array1.length + array2.length];
        int a = 0, b = 0, i = 0;
        while (a < array1.length && b < array2.length) {
            if (array1[a] < array2[b]) {
                combination[i] = array1[a];
                a++;

            } else {
                combination[i] = array2[b];
                b++;
            }
            i++;
        }

        while (a < array1.length) {
            combination[i] = array1[a];
            a++;
            i++;
        }

        while (b < array2.length) {
            combination[i] = array2[b];
            b++;
            i++;
            
        }
        
      return combination;

    }

}
