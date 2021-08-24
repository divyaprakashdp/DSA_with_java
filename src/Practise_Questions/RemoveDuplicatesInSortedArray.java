package Practise_Questions;

public class RemoveDuplicatesInSortedArray {
    public static void main(String[] args) {
        int[] input = {0,0,1,1,1,2,2,3,3,4};
        System.out.println("K="+removeDuplicates(input));

    }
    public static int removeDuplicates(int[] nums) {
        int count = 1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                nums[count] = nums[i];
                count++;

            }
        }
        for (int n:nums){
            System.out.println(n);
        }
        return count;
    }
}
