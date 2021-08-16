package Practise_Questions;

public class IterativeFactorial {
    public static void main(String[] args) {
        int factorial = getFactorialValue_new(6);
        System.out.println(factorial);
    }

    public static int getFactorialValue_new(int num){
        if(num==0){
            return 1;
        }else{
            int factorial = 1;
            for(int i = 1;i<=num;i++){
                factorial *= i;
            }
            return factorial;
        }
    }
}
