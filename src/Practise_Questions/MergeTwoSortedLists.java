package Practise_Questions;

import java.util.LinkedList;
import java.util.List;

public class MergeTwoSortedLists {

    public static void main(String[] args) {

        LinkedList<Integer> l1 = new LinkedList<Integer>();
        l1.add(1);
        l1.add(2);
        l1.add(4);
        LinkedList<Integer> l2 = new LinkedList<Integer>();
        l2.add(1);
        l2.add(3);
        l2.add(4);

        for(Object n: mergeSortedList(l1,l2)){
            System.out.println(n);
        }

    }
// need to update
    public static List mergeSortedList(LinkedList<Integer> l1, LinkedList<Integer> l2){
        List<Integer> out = new LinkedList<>();
        for(int i=0;i< l1.size();i++){
            if(l1.get(i)<l2.get(i)){

            }else if(l1.get(i).equals(l2.get(i))){
                l1.add(i, l2.get(i));
                l1.remove(i);
            }else{
                l1.add(i-1, l2.get(i));
                l1.remove(i);
            }
        }
        return out;
    }
}
