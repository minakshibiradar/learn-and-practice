package Queue;


import java.util.LinkedList;
import java.util.Queue;

public class queueSTL {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q);
        System.out.println(q.element());//1
        System.out.println(q.size());//5
        System.out.println(q.isEmpty());//false
        q.poll();//poll 1 poll and remove do same action
        System.out.println(q);//2 3 4 5
        q.remove();//poll 2
        System.out.println(q);// 3 4 5
        System.out.println(q.peek());//3
        System.out.println(q);// 3 4 5

    }
}
