package double_linked_list.simpleDLL;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        DoubleLinkedList obj=new DoubleLinkedList();
        while (true){
            int choice=sc.nextInt();
            if(choice==-1)
                break;
            else {
                obj.insertAtEnd(choice);
            }
        }
        obj.displayHead();
        obj.insertAtPosition(5, 90);
        obj.displayHead();
        obj.removeAtPosition(5);
        obj.displayHead();
        obj.removeAtPosition(0);
        obj.displayHead();
        obj.removeAtPosition(1);
        obj.displayHead();
        obj.removeAtPosition(1);
        obj.displayHead();
    }
}
