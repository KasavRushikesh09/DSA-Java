//Print factorial of a number n

public class Recursion1{
    public static int calcFact(int n){
       if(n == 1 || n == 0){
        return 1;
       }

       int calcFact_nm1 = calcFact(n-1);
       int calcFact_n = n * calcFact_nm1;
       return calcFact_n;
    }
    public static void main(String args[]){
       int n = 5;
       int ans = calcFact(n);
       System.out.println(ans);
    }
}