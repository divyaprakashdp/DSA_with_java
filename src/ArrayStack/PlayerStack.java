package ArrayStack;

public class PlayerStack {
    private Player[] stack;
    private int top;

    public PlayerStack(int capacity) {
        stack = new Player[capacity];
    }

    public void push(Player player){
        if(top == stack.length){
            // need to resize the array test
            stack = new Player[2*stack.length];
        }

        stack[top] = player;
        top++;

    }

    public int size(){
        return top;
    }

    public boolean isEmpty(){
        return stack.length<=0;
    }

    public Player peek(){
        if(stack.length==0){
            return null;
        }else{
            return stack[top-1];
        }
    }

    public void pop(){
        if(stack.length==0) {
            System.out.println("Stack is empty");
        }
         System.arraycopy(stack,1,stack,0,stack.length-1);
         top--;
    }

    public void printStack(){
        for(int i=top-1;i>=0;i--){
            System.out.println(stack[i]);
        }
    }
}
