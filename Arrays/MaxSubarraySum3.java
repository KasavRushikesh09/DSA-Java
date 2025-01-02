import java.util.*;
public class MaxSubarraySum3{
    public static void kadanes(int number[]){
       int ms = Integer.MIN_VALUE;
       int cs = 0;

       for(int i=0; i<number.length; i++){
        cs = cs + number[i];
        if(cs < 0){
            cs = 0;
        }
        ms = Math.max(cs,ms);
       }
       System.out.println("our max subarray sum is: " + ms);
    }
    public static void main(String args[]){
       int number[] = {2,4,6,8,10};
       kadanes(number);
    }
}