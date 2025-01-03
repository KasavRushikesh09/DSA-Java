import java.util.*;
public class BinaryClearLastithBit{
    public static int BianryLast(int n, int i){
        int bitmark = (~0)<<i;
        return n & bitmark;
    }
    public static void main(String args[]){
System.out.println( BianryLast(15,2));
    }
}
