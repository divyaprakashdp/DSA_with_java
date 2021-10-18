package CSES_ProblemSet;

public class MissingNumber {
    public static int missingNum(int n, int[] numList){
        //this function will fail if there are multiple missing numbers
        int sum = n*(1+n)/2;
        int temp = 0;
        for(int num:numList){
            temp += num;
        }
        return sum-temp;
    }
}
