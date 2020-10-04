package linkedlist.genericlinkedlist;

public class LinkedList<T extends Comparable<T>> implements List<T> {
    private NodeList<T> root;
    private int size;

    @Override
    public void insertAtBegin(T data) {

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
        int length=getSize();
        System.out.println(length+" "+position);
        if(position<0||position>length)
            System.out.println("[-]Incorrect Position");
        else {
            if(length==0){
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
                temp.setNext(ptr.getNext());
                ptr.setNext(temp);
            }

        }

    }

    @Override
    public void display() {
        NodeList<T> ptr=getRoot();
        while (ptr!=null){
            System.out.print(ptr.getData()+"->");
            ptr=ptr.getNext();
        }
    }

    @Override
    public NodeList<T> getRoot() {
        return root;
    }

    @Override
    public void removeAtBegin() {
        if(root==null){
            System.out.println("Linked List is empty");
        }
        else
            root=root.getNext();
    }

    @Override
    public void removeAtEnd() {
        if (root == null)
            System.out.println("Linked List is empty");
        else {
            if (root.getNext() == null) {
                root = null;
            }
            else{
                NodeList<T> ptr = root,prev=root;
                while (ptr.getNext()!=null){
                    prev=ptr;
                    ptr=ptr.getNext();
                }
                prev.setNext(null);
            }
        }
    }

    @Override
    public int getSize() {
        size = 0;
        NodeList<T> ptr = root;
        while (ptr != null) {
            size++;
            ptr = ptr.getNext();
        }
        return size;
    }

    @Override
    public void removeAtPosition(int position) {
        int length=getSize();
        if(position<0||position>=length)
            System.out.println("Incorrect Position");
        else {
            if(root==null)
                System.out.println("Linked List empty");
            else if(position==0)
                root=root.getNext();
            else {
                NodeList<T> ptr=root.getNext();
                for (int i=1;i<position-1;i++){
                    ptr=ptr.getNext();
                }
                ptr.setNext(ptr.getNext().getNext());
            }
        }
    }

    @Override
    public void traverse() {
        NodeList<T> ptr=root;
        for (int i=0;i<getSize();i++)
            System.out.print(ptr.getData()+"->");

    }

    @Override
    public boolean search(NodeList<T> root, T data) {
        if(root==null)
            return false;
        else if(root.getData()==data)
            return true;
        else
            return search(root.getNext(), data);
    }
}