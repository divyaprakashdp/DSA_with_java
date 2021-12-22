package Practise_Questions;

import java.util.LinkedHashSet;
import java.util.Set;

public class DiffTwoArrays {
    /*
    Compare two arrays and return a new array with any items only found in one of the two given arrays, but not both. In other words, return the symmetric difference of the two arrays.

Note: You can return the array with its elements in any order.
     */

    public static void main(String[] args) {
        int[] arr1 = {1,2,3,6};
        int[] arr2 = {1,2,3,4,5};
        diffArray(arr1, arr2);
    }

    public static void diffArray(int[] arr1, int[] arr2){
        Set<Integer> listOfNum1 = new LinkedHashSet<>();
        Set<Integer> listOfNum2 = new LinkedHashSet<>();
        for (int j : arr1) {
            listOfNum1.add(j);
        }
        for (int j : arr2) {
            listOfNum2.add(j);
        }
        System.out.println(listOfNum1);
        for (int j : arr2) {
            if (!listOfNum1.contains(j)) {
                System.out.println(j);

            }
        }
        for (int j : arr1) {
            if (!listOfNum2.contains(j)) {
                System.out.println(j);

            }
        }
    }
}
