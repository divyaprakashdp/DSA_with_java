package InterViewBit;

import java.util.ArrayList;

public class ArrayBug {
        public static ArrayList<Integer> rotateArray(ArrayList<Integer> A, int B) {
            ArrayList<Integer> ret = new ArrayList<Integer>();
            int temp = A.get((B-1)%A.size());
            for (int i = 0; i < A.size()-1; i++) {
                ret.add(A.get((i + B)%A.size()));
            }
            ret.add( temp );
            return ret;
        }

    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>();
        A.add(1);
        A.add(2);
        A.add(3);
        A.add(4);
        A.add(5);
        A.add(6);
        System.out.println(rotateArray(A, 1));

        System.out.println(4%4);

    }
}
