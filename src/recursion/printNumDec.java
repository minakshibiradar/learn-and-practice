package recursion;

import java.util.Scanner;

public class printNumDec {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        printNDec(n);
    }
    public static void printNDec(int n) {
        if (n == 0) return;
        System.out.print(n+" ");
        printNDec(n-1);
    }
}
