import java.util.*;
public class ClearBIT{
    public static int clearbit(int num, int i){
        int bitmark = ~(1<<i);
        return num & bitmark;
    }
    public static void main(String args[]){
       System.out.println(clearbit(10,1));
    }
}