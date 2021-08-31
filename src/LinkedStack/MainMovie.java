package LinkedStack;

public class MainMovie {
    public static void main(String[] args) {
        Movies first = new Movies("Sholay", "Drama", 180);
        Movies second = new Movies("Mugal-e-Azam", "Romance", 210);
        Movies third = new Movies("GodFather", "Drama", 180);

        MovieStack movieStack = new MovieStack();

        movieStack.push(first);
        movieStack.push(second);
        movieStack.push(third);

        movieStack.printStack();

        System.out.println(movieStack.size());

        System.out.println(movieStack.isEmpty());

        movieStack.pop();

        movieStack.printStack();

        System.out.println(movieStack.peek());


    }
}
