//Write a Java program tocheckif a number is a palindrome in Java? ( 121 is a
 //palindrome, 321 is not)
// Anumberis called a palindrome if the number is equal to the reverse of a number e.g., 121 is a
// palindrome because the reverse of 121 is 121 itself. On the other hand, 321 is not a
// palindrome because the reverse of 321 is 123, which is not equal to 321.

import java.util.*;
public class question3{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers: ");
        int palindrome = sc.nextInt();

        if(isPalindrome(palindrome)){
            System.out.println("Number: "+ palindrome + " is palindrome");
        }else{
            System.out.println("Number: "+ palindrome + " is Not palindrome");
        }

    }
    public static boolean isPalindrome(int number){
        int palindrome = number;
        int reverse = 0;

        while(palindrome != 0){
            int remainder = palindrome % 10;
            reverse = reverse *10+remainder;
            palindrome = palindrome/10;
        }
        if(number == reverse){
            return true;
        }
        return false;
    }
}