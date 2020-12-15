package queue.linkedList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Queue<T extends Number> extends Node<T> implements Operations<T>{
    private Node<T> head;

    @Override
    public void insert(T x) {
        Node<T> temp=new Node<>(),ptr=head;
        temp.setVal(x);
        if(head==null)
            head=temp;
        else {
        while (ptr.getNext()!=null)
             ptr=ptr.getNext();
        ptr.setNext(temp);
    }
    }

    @Override
    public Node<T> remove() {
        if(head==null)
            return null;
        else {
            Node<T> temp=head;
            head=head.getNext();
            return temp;
        }
    }

    @Override
    public void display() {
        Node<T> ptr=head;
        while (ptr!=null){
            System.out.print(ptr);
            ptr=ptr.getNext();
        }
        System.out.println();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer> obj=new Queue<>();
        while (true){
            System.out.println("Enter your choice:");
            int choice=Integer.parseInt(br.readLine());
            switch (choice){
                case 1->{
                    System.out.println("Enter the value to insert:");
                    obj.insert(Integer.parseInt(br.readLine()));
                }
                case 2-> System.out.println("Element removed:"+obj.remove());

                case 3-> obj.display();
                default -> {
                    br.close();
                    System.exit(0);
                }
            }
        }
    }
}
