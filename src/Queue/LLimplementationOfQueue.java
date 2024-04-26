package Queue;

public class LLimplementationOfQueue {
    public static class node{
        int data;
        node next;
        node(int data){
            this.data=data;
        }
    }
    public static class queuel{
        node head=null;
        node tail=null;
        int size=0;
        public void add(int x){
            node temp=new node(x);
            if(size==0){
                head=tail=temp;
            }
            else{
                tail.next=temp;
                tail=temp;
            }
            size++;
        }
        public int peek(){
            if(size==0){
                System.out.println("queue is empty");
                return -1;
            }
            else{
                return head.data;
            }
        }
        public int remove(){
            if(size==0){
                System.out.println("queue is empty");
                return -1;
            }
            else{
                int z=head.data;
                head=head.next;
                size--;
                return z;
            }

        }
        boolean isEmpty(){
            if(size==0) return true;
            else return false;
        }
        int size(){
            return size;
        }
        public void display(){
            if(size==0){
                System.out.println("queue is empty");
                return ;
            }
            else{
                node temp=head;
                while(temp!=null){
                    System.out.print(temp.data+" ");
                    temp=temp.next;
                }

            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        queuel q=new queuel();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
      q.add(50);
        q.display();//10 20 30 40 50
        System.out.println("peek element is "+q.peek());//10
        System.out.println("removed element "+q.remove());//10
        q.display();
        q.add(90);
        q.add(100);
        q.display();

    }
}
