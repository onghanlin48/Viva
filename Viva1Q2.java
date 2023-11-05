package viva.pkg1;
import java.util.Scanner;
public class Viva1Q2 {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        System.out.print("Enter an integer:");
        int oriNumber = s.nextInt();
        
        int total=0;int reverse;
        int number = Math.abs(oriNumber);
        
        while (number>0){
           reverse =  number % 10;
           total = total*10 + reverse;
           number/=10;
        }
            System.out.print("Reversed integer:");
            System.out.println((oriNumber<0? " -":"")+total);
    }
    
}
