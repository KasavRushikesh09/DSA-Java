import java.util.*;
public class MaxSubarraySum{
    public static void max_subarray(int number[]){
      int currSum = 0;
      int maxSum = Integer.MIN_VALUE;
     for(int i=0; i<number.length; i++){
        int start = i;
        for(int j=i+1; j<number.length; j++){
            int end = j;
            currSum = 0;
            for(int k = start; k <= end; k++){
                    //subarraySum
                    currSum += number[k];
        }
        System.out.println(currSum);
        if(maxSum < currSum){
          maxSum = currSum;
          }
        }
      }
      System.out.println("max sum = " + maxSum);
    }
    public static void main(String args[]){
      int number[] = {2,4,6,8,10};
      max_subarray(number);

    }

}