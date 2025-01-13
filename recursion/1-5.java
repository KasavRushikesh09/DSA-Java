public class file2{
    public static void PrintNumb(int n){
       if(n == 6 ){
           return;
       }
       System.out.println(n);
       PrintNumb(n+1);
    }
    public static void main(String args[]){
      int n=1;
      PrintNumb(n);
    }
}