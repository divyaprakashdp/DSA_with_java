//Leetcode - faster than 100%

package Practise_Questions;

import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,0,4,2};
        System.out.println(removeElement(nums, 2));
    }

    public static int removeElement(int[] nums, int val) {
        Arrays.sort(nums);
        int count = 0;
        for(int i=0;i< nums.length;i++){
            if(nums[i]==val && nums[i]<=val){
                nums[i] = '_';
                count++;
            }else if(nums[i]>val){
                break;
            }else{
            }

        }
        Arrays.sort(nums);
        for(int n:nums){
            System.out.print(n+", ");
        }
        return nums.length-count;
    }
}
