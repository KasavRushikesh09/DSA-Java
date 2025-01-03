import java.util.*;
public class GetBIT{
    public static int getbit(int num, int i){
      int bitmark = 1<<i;
      if((num & bitmark) == 0){
        return 0;
      }
      else{
        return 1;
      }
    }
    public static void main(String args[]){
       System.out.println(getbit(10,2));
    }
}