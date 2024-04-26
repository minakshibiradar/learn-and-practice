package Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class dqueue {
    public static void main(String[] args) {
        Deque<Integer> dq=new ArrayDeque<>();
        dq.add(10);
        dq.add(20);
        dq.add(30);
        dq.add(40);
        dq.add(50);
        System.out.println(dq);
        System.out.println(dq.size());
        System.out.println(dq.element());
        dq.remove();
        System.out.println(dq);
        System.out.println(dq.removeFirst());
        dq.addFirst(29);
        System.out.println(dq);
        System.out.println(dq.contains(90));
        dq.addFirst(100);
        dq.descendingIterator();
        System.out.println(dq);
//        System.out.println(dq.addAll(dqueue));

    }
}
