package Stack_LinkedList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Stack<T extends Number> extends List_Node<T> implements Operation<T> {
    private List_Node<T> head;

    public List_Node<T> getHead() {
        return head;
    }

    @Override
    public void push(T x) {
    List_Node<T> temp=new List_Node<>();
    temp.setValue(x);
    if(head==null)
        head=temp;
    else {
        List_Node<T> ptr=head;
        while (ptr.getNext()!=null)
            ptr=ptr.getNext();
        ptr.setNext(temp);
    }
    }

    @Override
    public T pop() {
        if(head==null) {
            System.out.println("[-] Stack is empty");
            return null;
        }
        else if(head.getNext()==null){
            T val=head.getValue();
            head=null;
            return val;
        }
        else {
            List_Node<T> ptr=head,prev=head;
            while (ptr.getNext()!=null) {
                prev=ptr;
                ptr = ptr.getNext();
            }
            T val=ptr.getValue();
            prev.setNext(null);
            return val;
        }
    }

    @Override
    public T peek() {
        List_Node<T> ptr=head;
        while (ptr.getNext()!=null)
            ptr=ptr.getNext();
        return ptr.getValue();
    }

    @Override
    public void display() {
        List_Node<T> ptr=head;
        while (ptr != null) {
            System.out.print(ptr);
            ptr = ptr.getNext();
        }
        System.out.println();
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> obj=new Stack<>();
        while (true){
            System.out.println("Enter your choice:");
            int choice=Integer.parseInt(br.readLine());
            switch (choice){
                case 1-> {
                    System.out.println("Enter the value:");
                    int value=Integer.parseInt(br.readLine());
                    obj.push(value);
                }
                case 2->{
                    System.out.println("Popped value:"+obj.pop());
                }
                case 3->{
                    System.out.println("Peek Value:"+obj.peek());
                }
                case 4-> obj.display();
                default -> System.exit(0);
            }
        }
    }
}
