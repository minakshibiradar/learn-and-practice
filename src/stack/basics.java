package stack;

import java.util.Stack;

public class basics {
    public static void main(String[] args) {
        Stack<Integer>st=new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);
        System.out.println("Topmost element of stack "+st.peek());
        st.pop();
        System.out.println(st);
        System.out.println("Size of the stack "+st.size());
        //print the stack element using for loop
        for(int i=st.size();i>0;i--){
            System.out.print(i+" ");
        }
    }
}
