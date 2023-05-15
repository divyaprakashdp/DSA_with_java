package RevisionCodes;

public class Main {
    public static void main(String[] args) {
        System.out.println(addNumbers(1, 2));
        System.out.println(addNumbers(1, 2, 3));
    }

    //method overloading
    public static int addNumbers(int num1, int num2){
        return num1+num2;
    }

    public static int addNumbers(int num1, int num2, int num3){
        return num1+num2+num3;
    }

    public static void methodFromParent(){
        System.out.println("I am from main");
    }
}

class Child extends Main{
    public static void main(String[] args) {
        methodFromParent();
    }

    //method overriding
    public static void methodFromParent(){
        System.out.println("I am from child");
    }
}
