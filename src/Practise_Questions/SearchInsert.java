package Practise_Questions;

import java.util.Arrays;

public class SearchInsert {
    public static void main(String[] args) {
        int[] nums = {1,4,6,8,9};
        System.out.println(searchInsert(nums, 10));
    }
    public static int searchInsert(int[] nums, int target) {
        for(int i=0;i< nums.length;i++){
            if(nums[i]==target){
                return i;
            }else if(nums[i]>target){
                return i;
            }
        }
        return nums.length;
    }
}
