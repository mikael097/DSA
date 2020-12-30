package trees;

import java.util.Stack;

public class Tree<T extends Number> extends Node<T> implements Operations<T>  {
    private  Node<T> root;
    Tree(){
        root = new Node<>();
    }

    @Override
    public void insert_elements(T[] arr) {
        Stack<Node<T>> stack=new Stack<>();
        for(T i:arr){
            if(i.doubleValue()==-1){
                stack.pop();
            }
            else {
                Node<T> temp = new Node<>();
                temp.setData(i);
                if(!stack.isEmpty()) {
                    stack.peek().setChildren(temp);
                }
                else
                    root=temp;
                stack.push(temp);
            }
        }
    }

    @Override
    public void display(Node<T> node) {
        StringBuilder str= new StringBuilder(node.getData() + "->");
        for(Node<T> i:node.getChildren()){
            str.append(i.getData()).append("->");
        }
        System.out.println(str);
        for(Node<T> i:node.getChildren()){
            display(i);
        }
    }

    public Node<T> getRoot() {
        return root;
    }
}
