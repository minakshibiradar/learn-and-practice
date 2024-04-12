package stack;

public class arrimple {
    public static class stack {
        private int[] arr=new int[10];
        private int idx=0;
         void push(int x){
             if(isFull()){
                 System.out.println("stack is full we can not insert");}
              else{
                  arr[idx]=x;
                  idx++;
            }
        }
        void display(){
             for(int i=0;i<=idx-1;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
        int size(){
            System.out.println("size is "+idx);
             return idx;
        }
        int peek(){
             if(isEmpty()){
                 System.out.println("stack is empty");
                 return -1;
             }
             else{
                 System.out.println("Topmost element of stack is "+arr[idx-1]);
                 return arr[idx-1];
             }
        }

        int pop(){
             if(isEmpty()){
                 System.out.println("stack is empty");
                 return -1;
             }
             else{
                int top=arr[idx-1];
                 arr[idx-1]=0;
                 idx--;
                 return top;
             }
        }
        boolean isEmpty() {
            if (idx == 0) {
                return true;
            } else {
                return false;
            }
        }
        boolean isFull(){
             if(idx==arr.length) return true;
             else return false;
        }
        int capacity(){
            System.out.println("cpacity is "+arr.length);
             return arr.length;
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
      s.capacity();
      s.size();
        System.out.println("Is stack empty "+s.isEmpty());
        System.out.println("Is stack full"+s.isFull());
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
