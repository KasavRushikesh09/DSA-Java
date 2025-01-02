// import java.util.*;
// public class bionomial{
//     public static int factors(int n){
//         int fact =1;
//         for(int i=1; i<=n; i++){
//             fact *= i;
//         }
//         return fact;
//     }
//         public static int binCoeff(int n, int r){
//         int fact_n = factors(n);
//         int fact_r = factors(r);
//         int fact_nmr = factors(n-r);

//         int binCoeff = fact_n/(fact_r * fact_nmr);
//         return binCoeff;

//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter value n: ");
//         int n = sc.nextInt();
//         System.out.println("Enter value r: ");
//         int r = sc.nextInt();
//         System.out.println(binCoeff(n,r));
//     }
// }

import java.util.*;
public class bionomial{
    public static int factors(int n){
        int fact =1;
        for(int i=1;i<=n;i++){
            fact *= i;
        }return fact;
    }

    public static int bioCoeff(int n , int r){
        int fact_n = factors(n);
        int fact_r = factors(r);
        int fact_nmr = factors(n-r);
        int bioCoeff = fact_n/(fact_r*fact_nmr);
        return bioCoeff;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n: ");
        int n = sc.nextInt();
        System.out.println("Enter value of r: ");
        int r = sc.nextInt();
        System.out.println(bioCoeff(n,r));
    }
}