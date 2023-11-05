package viva.pkg1;
import java.util.Scanner;
public class Viva1Q3 {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        System.out.print("Enter a number: ");
        int input = s.nextInt();
        int number = input;
        int digit; int total=0;int factorial;int i;
        
        while(number >0){
            digit = number %10;
           i=1;factorial=1;
           
           while (i<= digit){
            factorial = factorial*i;
            i++;
            }
            total = total + factorial;
            number= number/10;
            }

       System.out.println(total==input?"Strong number":"Not a Strong Number");
        }
       
              
    
}
