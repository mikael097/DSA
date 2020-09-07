package linkedlist.intermediate;

import java.util.Scanner;

public class LinkedList {
    ListNode head;
    LinkedList(){
        head=null;
    }

    ListNode createNode(int data){
        return new ListNode(data);
        
    }
    void insertAtEnd(int data){
        ListNode temp=createNode(data);
        if(head==null)
            head=temp;
        else {
            ListNode x=head;
            while (x.getNext() != null)
                x = x.getNext();
            x.setNext(temp);
        }
    }
    void insertAtBegin(int data){
        ListNode temp=new ListNode(data);
        temp.setNext(head);
        head=temp;
    }
    void display(){
        ListNode x=head;
        while (x!=null){
            System.out.print(x.getData()+",");
            x=x.getNext();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedList obj=new LinkedList();
        for(int i=1;i<=5;i++)
            obj.insertAtEnd(new Scanner(System.in).nextInt());
        obj.display();
        obj.insertAtBegin(6);
        obj.display();
    }
}
