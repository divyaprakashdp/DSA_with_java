package LinkedStack;

import java.util.EmptyStackException;
import java.util.LinkedList;

public class MovieStack {
    private LinkedList<Movies> stack = new LinkedList<>();
    private int top;

    public void push(Movies movie){
        stack.push(movie);
    }

    public int size(){
        return top;
    }

    public boolean isEmpty(){
        return stack.isEmpty();
    }

    public Movies pop(){
        return stack.pop();
    }
    public Movies peek(){
        return stack.peek();
    }

    public void printStack(){
        for(Movies movie: stack){
            System.out.println(movie);
        }
    }

}