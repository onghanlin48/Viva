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
public class VIVA2Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter Array1: ");
        String[] array1Input = input.nextLine().split(",");
        double[]array1= new double[array1Input.length];
        for (int i = 0; i < array1Input.length ; i++) {
            array1[i] = Double.valueOf(array1Input[i]);
        }

        
        System.out.print("Enter Array2: ");
        String[] array2Input = input.nextLine().split(",");
         double[]array2= new double[array2Input.length];
        for (int i = 0; i < array2Input.length; i++) {
            array2[i] = Double.valueOf(array2Input[i]);
        }
        System.out.printf("%.3f", calculateMedian(array1,array2));
        System.out.println();
        
    }
    public static double calculateMedian(double[]array1,double[]array2) {
        int totalLength= array1.length + array2.length;
        double[] combinedArray= new double[totalLength];
        
        //copying element in array1 to combined array
        for(int i=0; i< array1.length;i++){
            combinedArray[i]=array1[i];
        }
        for(int j=0; j<array2.length;j++){
            combinedArray[array1.length + j]=array2[j];
        }
        
        //sorting the combined array
        for ( int k =0; k<combinedArray.length;k++){
            for( int m =0; m<combinedArray.length-1;m++){
                if(combinedArray[m]>combinedArray[m+1]){
                    double temp=combinedArray[m];
                    combinedArray[m]=combinedArray[m+1];
                    combinedArray[m+1]=temp;
                }
            }
        }
        
        if(totalLength % 2==1){
            return combinedArray[totalLength/2];
        }
        else {
            int middle1 = ( totalLength / 2)- 1 ;
            int middle2 = totalLength / 2 ;
            return ( combinedArray[middle1] + combinedArray[middle2]) /2.0 ;
        }
    }
    
}
