package linkedlist.intermediate;

public class ListNode {
    private int data;
    private ListNode next;
    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

    ListNode(int data){
        this.setData(data);
        this.setNext(null);
    }
}