package RevisionCodes;

import java.util.*;

public class JavaCollections {
    public static void main(String[] args) {
//        demoArrayList();
        demoLinkedList();
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
        LinkedList<String> nameList = new LinkedList<>();

        nameList.add("Ramesh");
        nameList.add("Suresh");
        nameList.add("Mahesh");
        nameList.add("Naresh");
        nameList.add("Devesh");

        System.out.println(nameList);

//        LinkedList<String> moreNameList = new LinkedList<>(nameList); //Parameterized constructor call
        LinkedList<String> moreNameList = new LinkedList<>();
        moreNameList.addAll(nameList);
        moreNameList.add("Balwant");
        moreNameList.add("Satwant");

        System.out.println(moreNameList);

        moreNameList.remove("Suresh");
        moreNameList.addFirst("Ram");
        moreNameList.addLast("Laxman");

        System.out.println(moreNameList);

        Object copiedList = moreNameList.clone();
        System.out.println("Copied List ==> "+copiedList);

        System.out.println("Is the object present in list ==> "+ moreNameList.contains("Suresh"));

        System.out.println("item at index 0 ==>"+ moreNameList.get(0));


    }

}
