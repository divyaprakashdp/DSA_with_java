package Practise_Questions;

import java.util.LinkedList;
import java.util.List;

class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

public class MergeTwoSortedLists {

    public static void main(String[] args) {

        LinkedList<Integer> l1 = new LinkedList<>();
        l1.add(1);
        l1.add(2);
        l1.add(4);
        LinkedList<Integer> l2 = new LinkedList<>();
        l2.add(1);
        l2.add(3);
        l2.add(4);



        for(Object n: mergeSortedList(l1,l2)){
            System.out.println(n);
        }

    }
// need to update
    public static List mergeSortedList(LinkedList<Integer> l1, LinkedList<Integer> l2){
        for(int i=0;i< l1.size();i++){
            for(int j=0;j<l2.size();j++){
                if(l1.get(i)<l2.get(j)){
                    break;
                }else {
                    l1.add(i, l2.get(j));
                    l2.remove(j);
                }
            }

        }

        return l1;
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null){
            return l2;
        }
        if(l2==null){
            return l1;
        }
        if(l1.val<=l2.val){
            l1.next=mergeTwoLists(l1.next,l2);
            return l1;
        }
        else{
            l2.next=mergeTwoLists(l1,l2.next);
            return l2;
        }
    }
}
