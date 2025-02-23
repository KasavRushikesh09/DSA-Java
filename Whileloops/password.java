import java.util.*; 
import java.io.*;

public class Main {

  public static String SimplePassword(String str) {
    int len = str.length();
    if(len <= 7 || len >= 31){
      return "false";
    }
    if(str.toLowerCase().contains("password")){
      return "false";
    }

    boolean hasCapital = false;
    boolean hasNumber  = false;
    boolean hasPunctuation = false;

    for(int i= 0; i < len; i++){
      char c = str.charAt(i);
      if(Character.isUpperCase(c)){
        hasCapital = true;
      }else if(Character.isDigit(c)){
        hasNumber = true;
      }else if(Character.isLetterOrDigit(c)){
            hasPunctuation = true;
      }
    }
    if(hasCapital && hasNumber && hasPunctuation){
      return "true";
    }else{
      return "false";
    }
  }
  public static void main (String[] args) {  

    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(SimplePassword(s.nextLine())); 
  }
}


