package Practise_Questions;

public class MaxSubArray {

    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int[] nums1 = {1};
        int[] nums2 = {5,4,-1,7,8};
        int[] nums3 = {-1};
        int[] nums4 = {-2, -1};

        System.out.println(maxSubArray(nums4));
    }

    public static int maxSubArray(int[] nums) {
        //Kadane's algorithm
        int globalMax = Integer.MIN_VALUE;
        int localMax = 0;

        for (int num : nums) {
            localMax = Math.max(localMax + num, num);

            if (localMax > globalMax) {
                globalMax = localMax;
            }


        }
        return globalMax;

    }
}
