package Practise_Questions;

import java.util.ArrayList;

public class SumOddFibonacci {
    public static void main(String[] args) {
        System.out.println(sumFibs(10).toString());
    }

    public static ArrayList sumFibs(int num){
        ArrayList<Integer> series = new ArrayList<>();
        int first =0;
        int second =1;
        for(int i=0;i<num;i++){
            int next = first+second;
            series.add(next);
            first=second;
            second = next;


        }
        return series;
    }
}
