package Practise_Questions;

import java.util.Arrays;

public class SumAllInARange {
    public static void main(String[] args) {
        int[] arr = {1,4};
        sumAll(arr);
    }

    public static void sumAll(int[] nums){
        Arrays.sort(nums);
        int output = 0;
        for(int i=nums[0];i<=nums[1];i++){
            output += i;
        }
        System.out.println(output);
    }
}
