package recursion;
import java.util.*;
public class printNumber {
    public static void main(String[] args) {
//        here we are printing numbers in incresing order using recursion
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        printNInc(n);

    }
    public static void printNInc(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        printNInc(n-1);
        System.out.print(n+" ");
    }
}
