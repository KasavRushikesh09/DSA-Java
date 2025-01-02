import java.util.*;
public class halfpyramidnum{
    public static void half_pyramid_for_number(int num){
        for(int i=1; i<=num; i++){
            //inner 
            for(int j=1; j<=num-i+1; j++){
                System.out.print(j);
            }System.out.println();
        }
    }
    public static void main(String args[]){
        half_pyramid_for_number(5);
    }
}