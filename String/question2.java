//determine if 2 string are anagrams of each other.
import java.util.*;public class question2{
     public static void main(String args[]){
     String str1 = "race";
     String str2 = "care";

   //convert String to lowercase . why? sothat we dont have to check separately for 
   //lower and uppercase.

    str1 = str1.toLowerCase();
    str2 = str2.toLowerCase();

   //First check- if the length are the same
      if(str1.length() == str2.length()){

    //convert strings into char array
        char[] str1charArray = str1.toCharArray();
         char[] str2charArray = str2.toCharArray();
    //sort the char array
        Arrays.sort(str1charArray);
        Arrays.sort(str1charArray);
    //if the sorted char arrays are same or identical then the string are anagram

       boolean result = Arrays.equals(str1charArray, str2charArray);
        if(result){
           System.out.println(str1 + " and " + str2 + " are not anagram of each other."); 
        }
    
        else{
            System.out.println(str1 + " and " + str2 + " are anagram of each other.");
        }

    }
   
   }
}