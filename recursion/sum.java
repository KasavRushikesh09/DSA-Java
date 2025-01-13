public class sumofnaturalnumber{
    public static void main(String args[]){
    natural(1,5,0);
       
    }
    public static void natural(int i ,int n , int sum){
        if(i == n){
            sum += i;
                System.out.println(sum);
                return;
        }
            sum += i;
            natural(i+1, n, sum);
            System.out.println(i);
    }
}