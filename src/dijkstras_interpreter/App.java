package dijkstras_interpreter;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.EmptyStackException;

public class App extends Algorithm{
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("[*] Enter the correct expression:");
        String expression=br.readLine();
        double result;
        try {
            result = Algorithm.execute(expression);
            System.out.println("Result="+result);
        }
        catch (EmptyStackException ex){
            System.err.println("[-] Incorrect expression");
        }
    }
}
