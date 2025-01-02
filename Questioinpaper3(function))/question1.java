//Write a java method to compute the average of three numbers.

import java.util.*;
public class question1{
    public static void main (String args[]){
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter value of a: ");
     double a = sc.nextDouble();
     System.out.println("Enter value of b: ");
     double b = sc.nextDouble();
     System.out.println("Enter value of c: ");
     double c = sc.nextDouble();
     System.out.println("The average of 3 is: " + average (a,b,c)+ "\n");

    }

public static double average(double a, double b, double c){
    return(a+b+c)/3;
}
}