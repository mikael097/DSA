package circularlist;

import java.util.Scanner;

public class Run {
        public static void main(String[] args) {
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter:-");
                CircularLinkedList obj=new CircularLinkedList();
                while (true){
                        int n=sc.nextInt();
                        if(n==-1)
                                break;
                        obj.insertAtEnd(n);
                }

                obj.removeAtEnd();
                obj.removeAtEnd();
                obj.removeAtEnd();
                System.out.println(obj.getLength());
        }
}
