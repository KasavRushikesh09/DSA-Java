import java.util.*;
public class Question1{
    public static boolean question(int n){
        return (n & (n-1)) == 0;
    }
    public static void main(String args[]){
System.out.println(question(15));
    }
}