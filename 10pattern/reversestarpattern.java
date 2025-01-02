import java.util.*;
public class reversestarpattern{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        for(int line=1; line<=num; line++){
            for(int star=1; star<=(num-line+1); star++){
                System.out.print("*");
            }System.out.println();
        }
    }
}