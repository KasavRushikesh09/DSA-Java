import java.util.*;
public class BinaryUpdateBit{
      public static int clearbit(int num, int i){
        int bitmark = ~(1<<i);
        return num & bitmark;
    }
    public static int Setbit(int num , int i){
       int bitmask = 1<<i;
       return num | bitmask;
    }
    public static int updateithBit(int n ,int i, int newBit){
        if(newBit == 0){
            return clearbit(n,i);
        }else{
            return Setbit(n,i);
        }
    }
    public static void main(String args[]){
System.out.println(updateithBit(10,2,1));
    }
}