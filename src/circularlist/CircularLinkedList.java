package circularlist;

public class CircularLinkedList implements Operations {
        private int length;
        private CLLNode head;

        CircularLinkedList(){
                length=0;
        }
        private CLLNode create(int data){
                CLLNode temp=new CLLNode();
                temp.setData(data);
                ++length;
                return temp;
        }

        @Override
        public void insertAtEnd(int data) {
                CLLNode temp=create(data);
               if(head==null) {
                       head = temp;
                       head.setNext(head);
               }
               else {
                       CLLNode ptr=head;
                       while (ptr.getNext()!=head)
                               ptr=ptr.getNext();
                       ptr.setNext(temp);
                       temp.setNext(head);
               }
        }

        @Override
        public void removeAtBegin() {
                if (head == null)
                        System.out.println("No elements in list");
                else {
                        if (length == 1)
                                head = null;
                        else {
                                CLLNode ptr = head.getNext();
                                while (ptr.getNext() != head)
                                        ptr = ptr.getNext();
                                ptr.setNext(head.getNext());

                                head = head.getNext();
                        }
                        --length;
                }
        }


        @Override
        public void removeAtEnd() {
                if(head==null)
                        System.out.println("No elements in list");
                else {
                 if (length == 1)
                                head = null;
                        else {
                                CLLNode ptr = head.getNext(), prev = ptr;
                                while (ptr.getNext() != head) {
                                        prev = ptr;
                                        ptr = ptr.getNext();
                                }
                                prev.setNext(head);
                        }
                        --length;
                }
        }

        @Override
        public void insertAtBegin(int data) {
                CLLNode newNode = create(data), ptr = head;
                if(head==null){
                        head=newNode;
                        head.setNext(head);
                }
                else {
                        newNode.setNext(head);
                        while (ptr.getNext() != head)
                                ptr = ptr.getNext();
                        ptr.setNext(newNode);
                        head = newNode;
                }
        }

        @Override
        public void display() {
                CLLNode temp=head;
                while (true){
                        System.out.print(temp.getData()+"<->");
                        if(temp.getNext()==head)
                                break;
                        temp=temp.getNext();

                }
                System.out.println();
        }
        public int getLength(){
                return length;
        }
        public CLLNode getHead(){
                return head;
        }
}
