import java.util.*;
public class ODDorEVEN{
    public static void odd_even(int num){
        int bitmark = 1;
        if((num & bitmark) == 0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
    public static void main(String args[]){
        odd_even(3);
        odd_even(4);
    }
}