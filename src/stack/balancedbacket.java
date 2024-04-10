package stack;
import java.util.*;
public class balancedbacket {
    public static boolean isbalanced(String str){
       Stack<Character> st=new Stack<>();
       int len=str.length();
       for(int i=0;i<len;i++){
           char ch=str.charAt(i);
           if(ch=='('){
               st.push(ch);
           }
           else{
               if(st.isEmpty()) return false;
               if(st.peek()=='(') st.pop();
           }
       }
       if (!st.isEmpty()) return false;
       else return true;
    }
    public static void main(String [] args){
       Scanner sc=new Scanner(System.in);
       String str=sc.nextLine();
       System.out.println(isbalanced(str));
    }
}
