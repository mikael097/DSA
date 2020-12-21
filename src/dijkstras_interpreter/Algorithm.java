package dijkstras_interpreter;

import java.util.Stack;

public class Algorithm {
    public static double execute(String s){
        char[] expr=s.toCharArray();
        Stack<Character> operation=new Stack<>();
        Stack<Double> values=new Stack<>();
        for(char i:expr){
            if(Character.isDigit(i))
                values.push(Double.parseDouble(Character.toString(i)));
            else if(i=='+')
                        operation.push(i);
            else if(i=='*')
                        operation.push(i);
            else if(i=='-')
                        operation.push(i);
            else if(i=='/')
                        operation.push(i);
            else if(i==')'){
                double val1=values.pop(),val2=values.pop();
                char ch=operation.pop();
                values.push(operation(ch,val1,val2));
            }}
        return values.pop();
        }
    public static double operation(char ch, double x, double y){
        if(ch=='+')
            return x+y;
        if(ch=='-')
            return y-x;
        if(ch=='*')
            return x*y;
        return y/x;
    }
}
