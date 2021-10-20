package InterViewBit;

import java.util.ArrayList;
import java.util.List;

public class Spiral1 {

        // DO NOT MODIFY THE LIST. IT IS READ ONLY
        public static ArrayList<Integer> spiralOrder(final List<ArrayList<Integer>> A) {

            ArrayList<Integer> result = new ArrayList<Integer>();
            int m, n;
            m = A.size();
            n = A.get(0).size();
            if (m == 0)
                return result;
            int dir = 0; // right
            int row, col, layer;
            row = col = layer = 0;
            result.add(A.get(0).get(0));
            for (int step = 1; step < m * n; step++) {
                switch(dir) {
                    case 0:
                        if (col == n - layer - 1) {
                            dir = 1;
                            row++;
                        } else {
                            col++;
                        }
                        break;
                    case 1:
                        if (row == m - layer - 1) {
                            dir = 2;
                            col--;
                        } else {
                            row++;
                        }
                        break;
                    case 2:
                        if (col == layer) {
                            dir = 3;
                            row--;
                        } else {
                            col--;
                        }
                        break;
                    case 3:
                        if (row == layer + 1) {
                            dir = 0;
                            col++;
                            layer++;
                        } else {
                            row--;
                        }
                        break;
                }
                result.add(A.get(row).get(col));
            }
            return result;
        }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> A = new ArrayList<>();
        ArrayList<Integer> B = new ArrayList<>();
        ArrayList<Integer> c = new ArrayList<>();
        ArrayList<Integer> d = new ArrayList<>();

        B.add(1);
        B.add(2);
        B.add(3);
        B.add(11);

        c.add(4);
        c.add(5);
        c.add(6);
        c.add(22);

        d.add(7);
        d.add(8);
        d.add(9);
        d.add(33);

        A.add(0, B);
        A.add(1, c);
        A.add(2, d);

        System.out.println(spiralOrder(A));

    }

}
