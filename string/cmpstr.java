package string;
 //compare two strings
public class cmpstr {
  public static void main(String arg[]){
     String str1="hello";
     String str2="";
     String str3="aello";
     String str4="hello";
     String str5="qello";
     System.out.println("str1:str2 | " + str1.compareTo(str2)); //returns length of first string
     System.out.println("str1:str3 | " + str1.compareTo(str3));
     System.out.println("str1:str4 | " + str1.compareTo(str4));
     System.out.println("str1:str5 | " + str1.compareTo(str5));
  }
    
}
