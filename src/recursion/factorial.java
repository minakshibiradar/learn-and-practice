package recursion;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
//            Here we are using long because the size of integer overflow
//            i.e 2 to power 31-1 is the range of integer
            long fact=factorialOfNum(n);
        System.out.println("Factorial of given number is = "+fact);
    }
    public static long factorialOfNum(int n){
        if(n==1){
            return 1;
        }
        return n*factorialOfNum(n-1);

    }

}
