import java.util.*;
public class SetBIT{
    public static int Setbit(int num , int i){
       int bitmask = 1<<i;
       return num | bitmask;
    }
    public static void main(String arg[])
    {
       System.out.println(Setbit(10,2));
    }
}