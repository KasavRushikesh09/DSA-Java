import java.util.*;
public class countingSort{
    public static void counting_Sort(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            largest = Math.max(largest, arr[i]);
        }

        int count[] = new int[largest+1];
        for(int i=0; i<arr.length; i++){
            count[arr[i]]++;
        }
        //sorting
        int j = 0;
        for(int i=0;i<arr.length; i++){
            while(count[i] > 0){
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }
    public static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }System.out.println();
    }
    public static void main(String args[]) {
        int arr[] = {5,3,11,1,3,8,1};
         counting_Sort(arr);
         printarr(arr);
        
    }
} 