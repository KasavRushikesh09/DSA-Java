import java.util.*;
public class binarysearch{
    public static int binary_serach(int num[], int key){
        int start=0, end=num.length-1;

        while(start <= end){
            int mid = (start+end)/2;
            if(num[mid] == key){
                return mid;
            }
            if(num[mid] < key){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
     int num[] = {2,4,2,1,9,7,6,8};
     int key = 8;
     System.out.println("Index of "+key+" is: " +binary_serach(num,key));
    }
}