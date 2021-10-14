package OOPS;

public class TestClass {
    public static void main(String[] args) {
//        testSimpleCalculator();

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
