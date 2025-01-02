import java.util.*;
public class question4{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input an integers: ");
        int digits = sc.nextInt();
        System.out.println("The sun is " + sumDigits(digits));
    }

    public static int sumDigits(int n){
        int sumofDigits = 0;
        while(n>0){
            int lastDigit = n % 10;
            sumofDigits += lastDigit;
            n /= 10;
        }
        return sumofDigits;
    }
}