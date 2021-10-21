package InterViewBit;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class MaxNonNegativeSubArray {
//    to be revisited, not a complete solution
    public static ArrayList<Integer> maxset(ArrayList<Integer> A) {
        ArrayList<Integer> out = new ArrayList<>();
        ArrayList<Integer> indexes = new ArrayList<>();
        HashMap<Integer, ArrayList<Integer>> maxIndexMap = new LinkedHashMap<>();
        int globalMax=0;
        int localMax=0;
        for(int i=0;i<A.size();i++){

            if(A.get(i)>0){
                localMax += A.get(i);
                indexes.add(i);
            }else{
                localMax = 0;
                indexes.clear();
            }

            if(localMax>globalMax){
                globalMax=localMax;
                maxIndexMap.put(globalMax, indexes);
            }


        }
        out = maxIndexMap.get(globalMax);

        return A.subList(out.get(0), out.size());
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
