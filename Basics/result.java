import java.util.*;
public class result{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();

        String Result = ((marks >= 33)? "pass" : "fail");
        System.out.println(Result);
    }
}