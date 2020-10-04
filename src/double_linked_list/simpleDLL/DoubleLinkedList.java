package double_linked_list.simpleDLL;

public class DoubleLinkedList implements Operation{
    private DLLNode head;
    private DLLNode tail;
    private int length;

    DoubleLinkedList(){
        length=0;
    }

    @Override
    public DLLNode create(int data) {
        length++;
        DLLNode temp=new DLLNode();
        temp.setData(data);
        return temp;
    }

    @Override
    public void insertAtBegin(int data) {
        DLLNode temp=create(data);
        if(head==null)
            head=tail=temp;
        else {
            head.setPrev(temp);
            temp.setNext(head);
            head=temp;
        }
    }
    @Override
    public void insertAtEnd(int data){
        if(tail==null)
            head=tail=create(data);
        else {
            DLLNode temp=create(data);
            temp.setPrev(tail);
            tail.setNext(temp);
            tail=temp;
        }
    }

    @Override
    public void displayHead() {
        DLLNode temp=getHead();
        while (temp!=null) {
            System.out.print(temp.getData() + "->");
            temp = temp.getNext();
        }
        System.out.println();
    }

    @Override
    public void displayTail() {
        DLLNode temp=getTail();
        while (temp!=null) {
            System.out.print(temp.getData() + "->");
            temp = temp.getPrev();
        }
        System.out.println();
    }
    public DLLNode getHead(){
        return head;
    }
    public DLLNode getTail(){
        return tail;
    }

    @Override
    public void insertAtPosition(int pos, int data) {
        if(pos<0||pos>getLength())
            System.out.println("[-] Incorrect position");
        else {
            if(head==null){
                head=tail=create(data);
            }
            else if(pos==0)
                insertAtBegin(data);
            else if(pos==getLength())
                insertAtEnd(data);

            else {
                DLLNode ptr,temp;
                System.out.println(getLength());
                if (pos <= getLength() / 2) {

                    temp=create(data);
                    ptr = searchFromHead(pos);
                    temp.setNext(ptr.getNext());
                    temp.setPrev(ptr);
                    ptr.setNext(temp);
                } else {
                    System.out.println(getLength());
                    ptr=searchFromTail(pos);
                    temp=create(data);
                    temp.setPrev(ptr.getPrev());
                    temp.setNext(ptr);
                    ptr.getPrev().setNext(temp);
                }
            }
        }
    }

    @Override
    public void removeAtBegin() {
        if (getLength() == 0)
            System.out.println("[-] No elements in DLL");
        else {
            if (getLength() == 1)
                head = tail = null;

            else {
                head = head.getNext();
                head.setPrev(null);
            }
            length--;

        }
    }

    @Override
    public void removeAtPosition(int pos) {
        if (pos < 0 || pos >= length)
            System.out.println("[-] Incorrect Position");
        else if (head == null)
            System.out.println("[-] No elements in DLL");
        else if (pos == 0)
                removeAtBegin();
         else if(pos==length-1)
             removeAtEnd();
         else {
             DLLNode store;
          if(pos<=length/2){
             DLLNode ptr=head;
             for(int i=0;i<pos;i++)
                 ptr=ptr.getNext();
            store=ptr;
         }
         else {
             DLLNode ptr=tail;
             for(int i=length-1;i>pos;i--)
                 ptr=ptr.getPrev();
             store=ptr;
         }
         DLLNode temp=store.getPrev();
         temp.setNext(store.getNext());
         store.getNext().setPrev(temp);
         length--;
        }
    }
    @Override
    public void removeAtEnd() {
        if (getLength() == 0)
            System.out.println("[-] DLL is empty.");
        else {
         if (getLength() == 1)
                head = tail = null;
            else {
                tail = tail.getPrev();
                tail.setNext(null);
            }
            length--;
        }

    }
    private DLLNode searchFromTail(int pos) {
        int length=getLength();
        DLLNode temp=tail;
        for(int i=length-1;i>pos;i--)
            temp=temp.getPrev();
        return temp;
    }

    private DLLNode searchFromHead(int pos) {
        DLLNode temp=head;
        for(int i=1;i<pos;i++)
            temp=temp.getNext();
        return temp;
    }

    public int getLength(){ return length;}
}
