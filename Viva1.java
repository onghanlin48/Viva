package viva.pkg1;

public class Viva1 {

    public static void main(String[] args) {
        for (int i = 1; i <=5; i++) {
            // Print spaces before the numbers
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }

            for (int k = i; k >= 1; k--) {
                System.out.print(k);
            }

            for (int a = 2; a <= i; a++) {
                System.out.print(a);
            }

            System.out.println();
        }
    }
    
}
