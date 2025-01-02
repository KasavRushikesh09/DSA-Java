import java.util.*;
public class ternary{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();
    //ternary operator

    String type = ((number%2) == 0) ? "Even" : "Odd";
    System.out.println(type);
}
}