package Practise_Questions;

import java.util.LinkedList;
import java.util.List;

public class AddTwoNumbers {
    public static void main(String[] args) {

        LinkedList<Integer> l1 = new LinkedList<Integer>();
        l1.add(2);
        l1.add(4);
        l1.add(3);
        LinkedList<Integer> l2 = new LinkedList<Integer>();
        l2.add(5);
        l2.add(6);
        l2.add(4);

        for(Object n: addList(l1,l2)){
            System.out.println(n);
        }

    }

    public static List addList(LinkedList<Integer> l1, LinkedList<Integer> l2){
        int len;
        List<Integer> out = new LinkedList<>();
        if(l1.size()>=l2.size()){
            len = l1.size()+1;
        }else{
            len = l2.size()+1;
        }

        for(int i=0;i<len-1;i++){
            int element = l1.get(i)+l2.get(i);
            int carry = 0;
            if (element>=10){
                carry = element/10;
                element = element%10;
            }
            out.add(i, element);

        }
        return out;
    }
}
