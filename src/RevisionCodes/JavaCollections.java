package RevisionCodes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class JavaCollections {
    public static void main(String[] args) {
        demoArrayList();
    }

    public static void demoArrayList(){
        ArrayList<Integer> aList = new ArrayList<>();

        aList.add(52);
        aList.add(72);
        aList.add(32);
        aList.add(42);
        //Sorting ArrayList
//        aList.sort(((o1, o2) -> o1.compareTo(o2)));
        Collections.sort(aList);


        System.out.println(aList);

        aList.remove(0);

        System.out.println(aList);

        //toArray
        Object[] aListArray = aList.toArray();
        for(Object i:aListArray){
            System.out.println((Integer)i-2);
        }

        //Array to list
        List<Object> newList= new ArrayList<>();
        newList = Arrays.asList(aListArray);

        System.out.println(newList);

    }

    public static  void demoLinkedList(){

    }

}
