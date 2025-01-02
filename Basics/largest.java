import java.util.*;
public class largest{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a =9;
        int b =3;
        int c =6;

        if(a>b &&a>c){
            System.out.println("a is the greatest.");
        }
        else if(b>c){
            System.out.println("b is the greatest.");
        }
        else{
            System.out.println("c is the greatest.");
        }
    }
}