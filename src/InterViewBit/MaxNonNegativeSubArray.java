package InterViewBit;

import java.util.ArrayList;

public class MaxNonNegativeSubArray {
//    to be revisited, not a complete solution
    public static ArrayList<Integer> maxset(ArrayList<Integer> A) {
        ArrayList<Integer> out = new ArrayList<>();
        int globalMax=0;
        int localMax=0;
        for(int i=0;i<A.size();i++){
            if(A.get(i)>0){
                localMax += A.get(i);
            }else{
                if(localMax>globalMax){
                    globalMax=localMax;
                }
            }

        }
        System.out.println("Max:"+globalMax);
        return out;
    }

    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>();
        A.add(10);
        A.add(-1);
        A.add(2);
        A.add(3);
        A.add(-4);
        A.add(100);
        System.out.println(maxset(A));
    }
}
