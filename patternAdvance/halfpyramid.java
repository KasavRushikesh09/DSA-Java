import java.util.*;
public class halfpyramid{
    public static void half_pyramid(int n){
        for(int i=0; i<=n; i++){
            //spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1; j<=i;j++){
                System.out.print("*");
            }System.out.println();
        }
    }
    public static void main(String args[]){
         half_pyramid(10);
    }
}