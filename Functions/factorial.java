import java.util.*;
public class factorial{
    public static int factors(int n){
        int fact =1;
        for(int i=1; i<=n; i++){
            fact *= i;
        }
        return fact;
    }
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter number: ");
       int num = sc.nextInt();
      System.out.println(factors(num)); 
    }
}