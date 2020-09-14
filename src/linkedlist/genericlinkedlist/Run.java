package linkedlist.genericlinkedlist;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
            LinkedList<Integer> ll=new LinkedList<>();
           ll.insertAtBegin(10);
           ll.insertAtPosition(20, 1);
        ll.display();
//        ll.insertAtEnd(20);
//        ll.insertAtBegin(1);
//        ll.display();
//        System.out.println(ll.search(ll.getRoot(),100));
//        ll.insertAtPosition(100, 0);
//        ll.display();
        ll.removeAtEnd();
        ll.display();

    }
}
