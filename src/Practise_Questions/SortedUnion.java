package Practise_Questions;
/*
all values present from all arrays should be included in their original order, but with no duplicates in the final array

 */
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class SortedUnion {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 2};
        int[] arr2 = {5, 2, 1, 4};
        int[] arr3 = {2, 1};
        uniteUnique(arr1, arr2, arr3);
    }

    public static void uniteUnique(int[] ... args){
        Set<Integer> arrOut = new LinkedHashSet<>();
        for(int[] x : args){
            for(int y:x){
                arrOut.add(y);
            }
        }
        System.out.println(arrOut);
    }
}
