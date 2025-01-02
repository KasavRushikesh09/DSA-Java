import java.util.*;
public class Floyds{
    public static void floydsTriangle(int num){
        int counter =1;
        for(int i=1; i<=num; i++){
            //inner
            for(int j=1; j<=i; j++){
                System.out.print(counter + " ");
                counter++;
            }System.out.println();
        }
    }
  public static void main(String args[]){
    floydsTriangle(5);
  }
}