package Practise_Questions;

import java.util.Iterator;
import java.util.TreeSet;

public class RankUnsortedArray {

    public static void main(String[] args) {
        int[] inp = {12, 3, 6, 6, 20};//=>3,1,2,2,4
        int[] out = giveRankUsingSet(inp);
        for(int n:out){
            System.out.println(n);
        }
    }

    public static int[] giveRank(int[] inp) {//need to be fixed for duplicates
        int[] out = new int[inp.length];
        int count1=0;
        int count2=0;
        for(int i=0;i<inp.length;i++){
            for(int j = 0;j<inp.length;j++){
                if(j!= i){
                    if(inp[i]>inp[j]){
                        count1++;
                    }
                    if(inp[i]==inp[j]){
                        count2++;

                    }
                }

            }
            out[i]=count1+(count2-1)/2;
            count1=0;
            count2=0;
        }

        return out;
    }

    public static int[] giveRankUsingSet(int[] inp) {
        int[] out = new int[inp.length];
        TreeSet<Integer> setOfElements = new TreeSet<>();
        for(int n:inp){
            setOfElements.add(n);
        }
        System.out.println(setOfElements);

        for(int i=0;i<inp.length;i++){
            int count = 0;
            for (Integer setOfElement : setOfElements) {
                if (inp[i] != setOfElement) {
                    count++;
                } else if (inp[i] == setOfElement) {
                    count++;
                    break;
                }
            }
            out[i]=count;

        }

        return out;
    }
}
