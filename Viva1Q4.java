
package viva.pkg1;
import java.util.Scanner;

public class Viva1Q4 {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        System.out.print("Enter your password: ");
        String password = s.next();
        boolean hasUpperCase = false, hasLowerCase = false, hasDigit=false, hasSpecialChar=false;
        if (password.length()>=8){
            for (int i =0;i<password.length();i++){
                char character = password.charAt(i);
           //     Scanner special = new Scanner(password);
                
                if (Character.isUpperCase(character)){
                    hasUpperCase = true;
                }
                else if(Character.isLowerCase(character)){
                    hasLowerCase = true;
                }
                else if (Character.isDigit(character)){
                    hasDigit = true;
                }
                else if((!Character.isLetterOrDigit(character))&&(!Character.isWhitespace(character))){
                    hasSpecialChar = true;
                    }
           if(hasUpperCase && hasLowerCase && hasDigit && hasSpecialChar ){
                    break;
                }
            }  
        }else 
            System.out.println("Not enough letter");
        System.out.println(hasUpperCase && hasLowerCase && hasDigit && hasSpecialChar?"Strong Password":"Weak");
            
                
            
                
        
                
}
     
    
}
