import java.util.*;
public class halfpyramid{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = sc.nextInt();
        for(int line=1; line<=num; line++){
            for(int i=1; i<=line; i++){
                System.out.print(i);
            }System.out.println();
        }

    }
}