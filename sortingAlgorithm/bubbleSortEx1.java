// question :use the bubble sort algorithms to sort an array in decending order
// you can use arr an example: [3,6,2,1,8,7,4,5,3,1]

import java.util.*;
public class bubbleSortEX1{
    public static void bubble_sort(int arr[]){
        for(int turn=0; turn<arr.length-1; turn++){
            for(int j=0; j<arr.length-1-turn; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void print_arr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[] = {3,6,2,1,8,7,4,5,3,1};
        bubble_sort(arr);
        print_arr(arr);
    }
}