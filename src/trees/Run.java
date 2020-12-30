package trees;

public class Run {
    public static void main(String[] args) {
        Tree<Integer> tree=new Tree<>();
        tree.insert_elements(new Integer[]{10, 20, 40,-1,50,90,-1,100,-1,-1,60,-1,-1,30,70,110,-1,120,-1,-1,80,-1,-1,-1});
        tree.display(tree.getRoot());
    }
}
