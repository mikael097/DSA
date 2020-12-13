package circularlist.shibani;

public class CLL implements CLLIntface {
         Node head;
        private int length=0;

        public void getLength(){
                System.out.println("Length= " + length);
        }

        @Override
        public void insertEnd(int data) {
                Node newNode = new Node(data);
                if (head == null) {
                        head = newNode;
                        head.setNext(newNode);
                }else {
                        Node currentNode = head.getNext();
                        while (currentNode.getNext() != head){
                                currentNode = currentNode.getNext();
                        }
                        newNode.setNext(head);
                        currentNode.setNext(newNode);
                }
                length++;

        }

        @Override
        public void removeEnd() {
                if (head == null){
                        System.out.println("[-] List empty!");
                }
                else {
                        Node current = head.getNext();
                        Node prev = null;
                        if(current.getNext() == head) {
                                head = null;
                        }
                        else {
                                while (current.getNext() != head) {
                                        prev = current;
                                        current = current.getNext();
                                }
                                prev.setNext(head);
                                current = null;
                        }
                        length--;
                }
        }

        @Override
        public void removeBegin() {
                if (head == null){
                        System.out.println("[-] List Empty");
                }
                else {
                        if (head.getNext() == head){
                                head = null;
                        }
                        else {
                                Node current = head.getNext();
                                while (current.getNext() != head){
                                        current = current.getNext();
                                }
                                current.setNext(head.getNext());
                                head = head.getNext();
                        }
                        length--;
                }
        }

        @Override
        public void insertBegin(int data) {
                Node newNode = new Node(data);
                if (head == null){
                        head = newNode;
                        newNode.setNext(head);
                }else {
                        newNode.setNext(head);
                        Node currentNode = head.getNext();
                        while (currentNode.getNext() != head){
                                currentNode = currentNode.getNext();
                        }
                        head = newNode;
                        currentNode.setNext(head);
                }
                length++;

        }

        @Override
        public void traverseLength() {
                System.out.println("Length: " + length);
                if (head == null){
                        System.out.println("List Empty!");
                } else {

                        System.out.print(head.getData() + "->");
                        Node currentNode = head.getNext();
                        while (currentNode != head){
                                System.out.print(currentNode.getData() + "->");
                                currentNode = currentNode.getNext();
                        }
                        System.out.println(" ");
                }



        }
}