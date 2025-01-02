import java.util.*;
public class overloading{
    // public static int sum(int a, int b){
    //     return a+b;
    // }
    // public static int sum(int a, int b, int c){
    //     return a+b+c;
    // }
    // public static void main(String args[]){
    // System.out.println(sum(2,3));
    // System.out.println(sum(3,7,8));
    // }

    public static boolean isPrime(int n){
        if(n == 2){
            return true;
        }
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n % i == 0){
            return false;
        }
    }
    return true;
    }
    public static void main(String args[]){
    System.out.println(isPrime(9));
    }
}