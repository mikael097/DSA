package circularlist.shibani;

public class App {
        public static void main(String[] args) {
                CLL x = new CLL();
                x.traverseLength();
                x.insertEnd(10);
                x.insertEnd(20);
                x.getLength();
                System.out.println(x.head.getData());

                x.removeEnd();
                System.out.println(x.head.getData());
                x.getLength();
                System.out.println(x.head.getData());
                x.removeEnd();

        }
}