package linkedlist.intermediate;

import java.util.Scanner;

public class LinkedList {
    ListNode head;
    private  int length;
    LinkedList(){
        head=null;
        length=-1;
    }
    public int getLength(){
        ListNode ptr=head;
        while (ptr!=null){
            ptr=ptr.getNext();
            length++;}
        return length;
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
    void insertAtPosition(int data, int position){
        int len=getLength();
        if(position<0||position>len){
            System.out.println("Incorrect Position");
        }
        else {
            ListNode ptr=head;
            for (int i=0;i<position;i++)
                ptr=ptr.getNext();
            ListNode temp=createNode(data);
            temp.setNext(ptr.getNext());
            ptr.setNext(temp);
            if(position==0)
                head=ptr;
        }
    }
    void display(){
        ListNode x=head;
        while (x!=null){
            System.out.print(x.getData()+",");
            x=x.getNext();
        }
        System.out.println();
    }
    void removeAtBegin(){
        if(head==null)
            System.out.println("No elements in Linked List");
        else
            head=head.getNext();

    }
    void removeAtEnd(){
        if(head==null)
            System.out.println("No elements in Linked List");
        else{
            ListNode ptr=head,prev=head;
            while (ptr.getNext()!=null){
                prev=ptr;
                ptr=ptr.getNext();
            }
            prev.setNext(null);
        }
    }

    public static void main(String[] args) {
        LinkedList obj=new LinkedList();
        for(int i=1;i<=5;i++)
            obj.insertAtEnd(new Scanner(System.in).nextInt());
        obj.display();
        obj.insertAtBegin(6);
        obj.display();
        obj.removeAtBegin();
        obj.display();
        obj.removeAtEnd();
        obj.display();
        obj.insertAtPosition(999, 0);
        obj.display();
    }
}
