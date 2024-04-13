package Queue;

public class arrayimple {
    public static class queue {
        int[] arr = new int[10];
        int size = 0;
        int f = -1, r = -1;

        public void add(int val) {
            if (size == arr.length) {
                System.out.println("Queue is full");
            } else {
                if (f == -1) {
                    // If the queue is empty, initialize front and rear pointers
                    f = 0;
                    r = 0;
                } else {
                    // Increment rear pointer, wrap around if necessary
                    r = (r + 1) % arr.length;
                }
                arr[r] = val; // Add the value at the rear position
                size++; // Increase the size of the queue
            }
        }

        int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            } else {
                return arr[f];
            }
        }

        int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            } else {
                int x = arr[f];
                f = (f + 1) % arr.length;
                size--;
                return x;
            }
        }

        boolean isEmpty() {
            return size == 0;
        }

        boolean isFull() {
            return size == arr.length;
        }

        int size() {
            return size;
        }

        void display() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
            } else {
                int i = f;
                do {
                    System.out.print(arr[i] + " ");
                    i = (i + 1) % arr.length;
                } while (i != (r + 1) % arr.length);
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        queue q = new queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.display();
        System.out.println("Size: " + q.size());
        System.out.println("isEmpty: " + q.isEmpty());
        System.out.println("remove: " + q.remove());
        q.display();
        System.out.println("remove: " + q.remove());
        q.display();
        System.out.println("peek: " + q.peek());
        q.display();
        System.out.println("is full? "+q.isFull());
    }
}
