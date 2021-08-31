package ArrayStack;

import java.util.EmptyStackException;

public class PlayerStack {
    private Player[] stack;
    private int top;

    public PlayerStack(int capacity) {
        stack = new Player[capacity];
    }

    public void push(Player player){
        if(top == stack.length){
            // need to resize the array test
            Player[] newStack = new Player[2*stack.length];
            System.arraycopy(stack, 0, newStack, 0, stack.length);
            stack = newStack;
        }

        stack[top] = player;
        top++;
        //or stack[top++] = player; =>O(1)

    }

    public int size(){
        return top;
    }

    public boolean isEmpty(){
        return top==0;
    }

    public Player peek(){
        if(isEmpty()){
            throw new EmptyStackException();
        }else{
            return stack[top-1];
        }
    }

    public Player pop(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        Player player = stack[--top];
        stack[top] = null;
        return player;
    }

    public void printStack(){
        for(int i=top-1;i>=0;i--){
            System.out.println(stack[i]);
        }
    }
}
