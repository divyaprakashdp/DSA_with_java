package OOPS;

public class TestClass {
    public static void main(String[] args) {
//        testSimpleCalculator();
//        testPerson();
        testBank();

    }

    public static void testBank(){
//        Bank bank = new Bank();//calling empty constructor
        //use parameterized constructor to avoid setting the values multiple times
        Bank bank = new Bank("Raju", 785785, 1000, 891685678, "gg@ww.com");


        System.out.println(bank);

        bank.withdraw(100);
        System.out.println(bank.getBalance());

        bank.withdraw(100000);

        System.out.println(bank.getBalance());
    }

    public static void testPerson(){
        Person person= new Person();
        person.setFirstName("");
        person.setLastName("");
        person.setAge(10);

        System.out.println("fullName= "+ person.getFullName());
        System.out.println("teen= "+ person.isTeen());

        person.setFirstName("John");
        person.setAge(18);

        System.out.println("fullName= "+ person.getFullName());
        System.out.println("teen= "+ person.isTeen());

        person.setLastName("Smith");
        System.out.println("fullName= "+ person.getFullName());

    }

    public static void testSimpleCalculator(){
        SimpleCalculator calculator=new SimpleCalculator();
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        System.out.println("Add: "+calculator.getAdditionResults());
        System.out.println("Subtract: "+ calculator.getSubtractionResults());
        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);
        System.out.println("multiply: "+ calculator.getMultiplicationResults());
        System.out.println("division: "+ calculator.getDivisionResults());
    }
}
