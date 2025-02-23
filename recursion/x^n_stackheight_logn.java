public class solution{
    public static int calcPower(int x, int n){
       if(n == 0){
        return 1;
       }
       if( x == 0){
        return 0;
       }
       if(n % 2 == 0){ //even
        return calcPower(x, n/2)* calcPower(x, n/2);
       }
       else{
        return calcPower(x, n/2)* calcPower(x, n/2)*x;
       }
    }
    public static void main(String args[]){
        int  n=5;
        int x=2;
        int ans = calcPower(x,n);
        System.out.println(ans);
    }
}