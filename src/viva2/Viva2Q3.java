
package viva2;
import java.util.Scanner;

public class Viva2Q3 {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        System.out.print("Enter 6 value: ");
        String [] input = new String [6];
        input = s.nextLine().split(",");
//        for(String values:input){
//            System.out.print(values+" ");
//        }
        boolean [] output = new boolean[6];
        for(int i=0;i<6;i++){
            if(isNumeric(input[i])){
                output[i]=true;
        }
        }for(int i=0;i<6;i++){
            if(i==0){
                System.out.print("{"+output[i]+",");
            }else if (i==5){
                System.out.print(output[i]+"}");
            }else
                System.out.print(output[i]+",");
        }
                System.out.println("");

    }
    public static boolean isNumeric(String input){
        try{
            Double.parseDouble(input);
            return true;
        }catch(NumberFormatException e){
            return false;
        }
    }
}
