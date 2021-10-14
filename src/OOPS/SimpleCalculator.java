package OOPS;

public class SimpleCalculator {
    private double firstNumber;
    private double secondNumber;

    public double getFirstNumber() {
        return firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    public double getAdditionResults(){
        return firstNumber+secondNumber;
    }

    public double getSubtractionResults(){
        return firstNumber-secondNumber;
    }

    public double getMultiplicationResults(){
        return firstNumber*secondNumber;
    }

    public double getDivisionResults(){
        if(secondNumber==0){
            return 0;
        }else{
            return firstNumber/secondNumber;
        }
    }


}
