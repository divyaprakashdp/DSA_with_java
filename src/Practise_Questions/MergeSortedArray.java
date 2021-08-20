package Practise_Questions;

import java.util.Arrays;

/*
Leetcode 88. Merge Sorted Array
faster than 100%. Runtime - 0 ms
 */
public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,7,8,9};
        int m=0;
        int[] nums2 = {2,5,6};
        int n = 3;

        merge(nums1, m, nums2, n);

        for(int z:nums1){
            System.out.println(z);
        }
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {

            System.arraycopy(nums2,0,nums1,m,n);
            Arrays.sort(nums1);

    }
}
