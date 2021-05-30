package string;
//using equalsIgnoreCase(),so that strings are compared irrespective of case
import java.util.Scanner;

public class palindrome1 {

    public static void main(String arg[]){
            Scanner s=new Scanner(System.in);
              System.out.println("Enter String :");
              String str=s.next();
              String str1="";
              for(int i=str.length()-1;i>=0;i--){
                str1=str1 + str.charAt(i);
              }
              if (str.equalsIgnoreCase(str1)){
                  System.out.println("\n" + str + " is palindrome");
              }
              else{
                  System.out.println("Not palindrome");}
              
              
              }
            
              
          }
    
    
    

