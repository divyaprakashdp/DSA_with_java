package InterViewBit;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class MaxNonNegativeSubArray {
//    to be revisited, not a complete solution
    public static ArrayList<Integer> maxset(ArrayList<Integer> A) {
        ArrayList<Integer> newArray = new ArrayList<>();
        ArrayList<Integer> maxArray = new ArrayList<>();
        int globalMax=0;
        int localMax=0;
        for (Integer integer : A) {

            if (integer > 0) {
                localMax += integer;
                newArray.add(integer);

            } else {
                localMax = 0;
                newArray = new ArrayList<>();
            }

            if ((globalMax < localMax) || ((globalMax == localMax) && (newArray.size() > maxArray.size()))) {
                globalMax = localMax;
                maxArray = newArray;
            }
        }

        return maxArray;
    }

    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>();
        A.add(1);
        A.add(2);
        A.add(5);
        A.add(-7);
        A.add(2);
        A.add(3);
        System.out.println(maxset(A));
    }
}
