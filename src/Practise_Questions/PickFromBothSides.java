//InterviewBit

package Practise_Questions;

import java.util.ArrayList;

public class PickFromBothSides {

    public static void main(String[] args) {
        ArrayList<Integer> test = new ArrayList<>();
        test.add(5);
        test.add(-2);
        test.add(3);
        test.add(1);
        test.add(2);

        System.out.println(solve(test, 3));
    }

    public static int solve(ArrayList<Integer> A, int B) {
        int largest = 0;

        for(int i = 0; i<A.size();i++){
            int sum = 0;
            int head = i;
            int tail = B-i;
            for(int j = 0;j<head;j++){
                sum += A.get(j);
            }

            for(int k=A.size()-1;k>=A.size()-tail;k--){
                sum += A.get(k);
            }

            if(sum>largest){
                largest=sum;
            }else{
                continue;
            }
        }
        return  largest;
    }
}
