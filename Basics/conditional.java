// if - else Statement :

//port java.util.*;
// public class conditional {
//     public static void main(String args[]){
//     Scanner sc = new Scanner(System.in);
//     int age = sc.nextInt();
//     if(age >= 18) {
//         System.out.println("The User is adult");
//     }
   
//     if(age >13 && age<18 ){
//         System.out.println("The User is Teenager");
//     } 

//     else{
//         System.out.println("The user is not Adult");
//     }

//     }
// }

//ex if - else statement :
//print the largest of 2
// import java.util.*;
// public class conditioanl{
//     public static void main (String args[]){
//         int A = 1;
//         int B = 3 ;
//         if(A>B){
//             System.out.println("A is the largest number as compare to B");
//         }
//         else{
//             System.out.println("B is largest as compare to A");
//         }
//     }
// }

// ex print if a number is odd or even
// import java.util.*;
// public class conditional{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         if( n % 2 ==0){
//             System.out.println(n+":This number is even");
//         }else{
//             System.out.println(n + ":This number is odd");
//         }
//     }
// }

//else if statement
// import java.util.*;
// public class conditional{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int age = sc.nextInt();
//         if(age > 18){
//             System.out.println("adult");
//         }
//         else if(age >= 13 && age<18){
//             System.out.println("Teenagers");
//         }
//         else{
//             System.out.println("child");
//         }
//     }
// }
// import java.util.*;
// public class conditioanl{
//     public static void main(String args[]){
//     Scanner sc = new Scanner(System.in);
//     int income = sc.nextInt();
//     int tax    = (income*18)/100;
//     int tax2   =(income*9)/100;
//     if(income >= 500000){
//         System.out.println("The income tax is :"+ tax);
//     }
//     else if(income >= 350000 && income < 550000){
//         System.out.println("The income tax is :"+ tax2);
//     }
//     else{
//         System.out.println("Wow,there is no tax");
//     }
// }
// }

import java.util.*;
public class conditional{
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        int income = sc.nextInt();
        int tax;

        if(income < 500000){
            tax = 0;
        }
        else if(income >= 500000 && income <1000000){
            tax =(int) (income * 0.2);
        }
        else{
            tax =(int) (income * 0.3);
        }
        System.out.println("your tax is :" + tax);
    }
}