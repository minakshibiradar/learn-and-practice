package Linkedlist;
import javax.xml.transform.Source;
import java.util.*;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Basics {


        public static class Node {
            int data;
            Node next;

            Node(int data) {
                this.data = data;
            }
        }

        Node head = null;
        Node tail = null;
        int size = 0;

        public void insertAtBeginning(int x) {
            Node newNode = new Node(x);
            if (head == null) {

                head = newNode;
                tail = newNode;
            } else {
                Node temp = head;
                head = newNode;
                head.next = temp;

            }
            size++;


        }

        public void insertAtEnd(int y) {
            Node newNode = new Node(y);
            if (head == null) {

                head = newNode;
                tail = newNode;
            } else {
                Node temp = head;
                while(temp.next!=null){
                    temp=temp.next;
                }
                temp.next = newNode;


            }
            size++;


        }

        public void displayList() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
                size++;
            }

        }
        public void length() {
            System.out.println();
            System.out.println("length of the array is="+size);
        }

        public void delete(int index) {
            Node temp=head;
            for(int i=1;i<=index-1;i++){
                temp=temp.next;
            }
            temp.next=temp.next.next;
            size--;

        }
        public void get(int index) {
            Node temp = head;
            if(index==0){
                System.out.println(temp.data);
            }
            else if(size>index || index<0){
                System.out.println("Wrong input ,Try AGAIN!");
            }

            else {
                for (int i = 1; i <= index - 1; i++) {
                    temp = temp.next;
                }
                System.out.println(temp.next.data);
            }
        }

        public void insertAnywhere(int z,int index){
            Node newNode=new Node(z);
            Node temp=head;
            for (int i = 1; i <= index - 1; i++) {
                temp = temp.next;
            }
            Node par=temp.next;
            temp.next=newNode;
            newNode.next=par;
        }



        public static void main(String[] args) {
            Basics s=new Basics();
            s.insertAtBeginning(20);
            s.insertAtBeginning(200);
            s.insertAtBeginning(2000);
            s.insertAtBeginning(20000);
            s.displayList();
            s.length();
            s.insertAtEnd(100);
            s.displayList();
            System.out.println();
            System.out.println("new linked list");
            s.delete(3);
            s.displayList();
            System.out.println();
            s.get(0);
            System.out.println();
            s.get(5);
            s.displayList();
            System.out.println();

            s.insertAnywhere(700,3);
            s.displayList();



        }
    }


