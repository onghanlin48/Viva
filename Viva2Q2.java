/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viva2;

/**
 *
 * @author User
 */
public class Viva2Q2 {
    
    public static void main(String[] args) {
        double[] array1 = {2.5,1.2,3.3,4.7};
        double[] array2 =   {10.3,4.2,6.6,2.1};
        
        double median = getMedian(array1, array2);
        System.out.printf("The median is: %.3f" , median);
        
        System.out.println();
    }
    
    public static double getMedian(double[] arr1, double[] arr2) {
        int arr1Size = arr1.length;
        int arr2Size = arr2.length;
        
        double[] arr3 = new double[arr1Size + arr2Size];
        
        System.arraycopy(arr1, 0, arr3, 0, arr1Size);
        System.arraycopy(arr2, 0, arr3, arr1Size, arr2Size);
        
        for (int pass = 1; pass < arr3.length; pass++) {
            for (int i = 0; i < arr3.length-1; i++) {
                if (arr3[i] > arr3[i+1]) {
                    double temp = arr3[i];
                    arr3[i] = arr3[i+1];
                    arr3[i+1] = temp;
                }
            }
        }
        
        int arr3Size = arr3.length;
        int middle = arr3.length/2;
        
        if (arr3Size%2 == 0) {
            double before = arr3[middle];
            double after = arr3[middle-1];
            
            double result = (before+after)/2;
            return result;
        }
        else {
            return arr3[middle];
        }
    }
    
}
