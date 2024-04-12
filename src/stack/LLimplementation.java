package stack;

import org.w3c.dom.ls.LSOutput;

public class LLimplementation {
    public static class node{
        int data;
        node next;
        node(int data){
            this.data=data;
        }
    }
    public static class stack{
       private node head=null;
      private  int size=0;
        void push(int x){
            node temp=new node(x);
            temp.next=head;
            head=temp;
            size++;
        }
        int peek() {
            if (head == null) {
                System.out.println("stack is empty ");
                return -1;
            } else {
                System.out.println("Topmost element of stack is  " + head.data);
                return head.data;
            }
        }
        void display(){
            displayreccursive(head);//for giving head pointer without this we have to
            // give head from min class with every call and printing new line also
            System.out.println();
        }
        void displayreccursive(node h){
            if(h==null)return;
            displayreccursive(h.next);
            System.out.print(h.data+" ");
        }
        void displayreverse(){
            node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
        }
        int size(){
            System.out.println("size of stack is "+size);
            return size;
        }
         int pop(){
            if(head==null){
                System.out.println("stack is empty ");
                return -1;
            }
            else {
                int val = head.data;
                head = head.next;
                size--;
                return val;
            }
         }
         boolean isEmpty() {
             if (size == 0) return true;
             else{
                 return false;
             }
         }


    }
    public static void main(String[] args) {
        stack s=new stack();
        s.push(7);
        s.push(10);
        s.push(25);
        s.push(100);
        s.push(1000);
        s.display();
        s.peek();
        s.pop();
        s.display();
//        s.capacity();
        s.size();
        System.out.println("Is stack empty ?"+s.isEmpty());
//        System.out.println("Is stack full"+s.isFull());
        s.push(2);
        s.push(3);
        s.push(9);
        s.display();
        s.push(6);
        s.push(11);
        s.push(22);
        s.push(7);
        s.display();
    }
}
