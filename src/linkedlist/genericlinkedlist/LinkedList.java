package linkedlist.genericlinkedlist;

public class LinkedList<T extends Comparable<T>> implements List<T> {
    private NodeList<T> root;
    private int size;

    @Override
    public void insertAtBegin(T data) {
        ++size;
        if(root==null){
            root=new NodeList<>();
            root.setData(data);
            root.setNext(null);
        }
        else {
            NodeList<T> ptr=new NodeList<>();
            ptr.setNext(root);
            ptr.setData(data);
            root=ptr;
        }
    }

    @Override
    public void insertAtEnd(T data) {
        ++size;
        if(root==null){
            root=new NodeList<>();
            root.setData(data);
            root.setNext(null);
        }
        else {
            NodeList<T> ptr=root;
            while (ptr.getNext()!=null)
                ptr=ptr.getNext();
            NodeList<T> temp=new NodeList<>();
            ptr.setNext(temp);
            temp.setData(data);
            temp.setNext(null);
        }
    }

    @Override
    public void insertAtPosition(T data,int position) {
        if(position<0||position>size)
            System.out.println("[-]Incorrect Position");
        else {
            if(size==0){
                root=new NodeList<>();
                root.setData(data);
                root.setNext(null);
            }
            else if(position==0){
                NodeList<T> temp=new NodeList<>();
                temp.setData(data);
                temp.setNext(root);
                root=temp;
            }
            else {
                NodeList<T> ptr=root;
                for (int i=0;i<position-1;i++)
                    ptr=ptr.getNext();
                NodeList<T> temp=new NodeList<>();
                temp.setData(data);
                temp.setNext(ptr.getNext().getNext());
                ptr.setNext(temp);
            }
            ++size;
        }

    }

    @Override
    public void removeAtBegin() {
        if(root==null){
            System.out.println("Linked List is empty");
        }
        else {
            root=root.getNext();
            --size;
        }
    }

    @Override
    public void removeAtEnd() {
        if (root == null)
            System.out.println("Linked List is empty");
        else {
            if (root.getNext() == null) {

                --size;

            }
        }
    }

    @Override
    public void removeAtPosition(int position) {
    --size;
    }

    @Override
    public void traverse() {
        NodeList<T> ptr=root;
        for (int i=0;i<size;i++)
            System.out.print(ptr.getData()+"->");

    }

    @Override
    public boolean search(T data) {
        return false;
    }
}