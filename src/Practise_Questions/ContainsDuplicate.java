package Practise_Questions;

import java.util.*;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,1};
        System.out.println(containsDuplicate(arr1));
    }

    public static boolean containsDuplicate(int[] nums){
        Arrays.sort(nums);
        HashMap<Integer,Integer> mapper=new HashMap<>();
        for (int i=0;i<nums.length;i++) {
            mapper.put(nums[i], nums[i]);
            if(i<nums.length-1){
                if(mapper.containsKey(nums[i+1] )){
                    return true;
                }
            }

        }
        return false;
//        return mapper.size()<nums.length;

    }

    public static boolean containsDuplicateWithSet(int[] nums){
        Set<Integer> mapper = new LinkedHashSet<>();
        for (int num : nums) {
            mapper.add(num);
        }
        return mapper.size()<nums.length;

    }




}
