//Write a method named isEven that accepts an int argument. The method
 //should return true if the argument is even, or false otherwise. Also write a program to test your
 //method.

import java.util.*;
public class question2{
    public static boolean isEven(int n){
       return n % 2 == 0;
    }
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: " );
        int n = sc.nextInt();
    if(isEven(n)){
       System.out.println(n + " is even.");
    }else{
        System.out.println(n + " is odd.");
    }
    }
}