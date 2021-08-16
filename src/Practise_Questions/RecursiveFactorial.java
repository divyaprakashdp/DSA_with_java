package Practise_Questions;

public class RecursiveFactorial {
    public static void main(String[] args) {
        int factorial = 0;
        try{
            factorial = getFactorialValue(6);
            System.out.println(factorial);
        }catch (Exception e){
            System.out.println(e);
        }



    }

    public static int getFactorialValue(int num) throws Exception {
        if(num==0){ //base case
            return 1;
        }else if(num<0){
            throw new Exception("Factorial of a negative number can not be calculated");
        }else{
            return num*getFactorialValue(num-1);
        }
    }
}
