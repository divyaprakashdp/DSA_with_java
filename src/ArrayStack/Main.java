package ArrayStack;

import arrayLists.Employee;

public class Main {
    public static void main(String[] args) {
        Player first = new Player("Raju", 12);
        Player second = new Player("Sham", 19);
        Player third = new Player("Babu", 190);
        Player fourth = new Player("Devi", 90);
        PlayerStack playerStack = new PlayerStack(2);

        playerStack.push(first);
        playerStack.push(second);
        playerStack.push(third);
        playerStack.push(fourth);

        playerStack.printStack();
        System.out.println("================================");

        playerStack.pop();
        playerStack.printStack();

        System.out.println("top player => "+playerStack.peek());

        System.out.println(playerStack.size());

        System.out.println(playerStack.isEmpty());


    }
}
