package RevisionCodes;

import java.util.ArrayList;

public class JavaCollections {
    public static void main(String[] args) {
        demoArrayList();
    }

    public static void demoArrayList(){
        ArrayList<Integer> aList = new ArrayList<>();

        aList.add(12);
        aList.add(22);
        aList.add(32);
        aList.add(42);

        System.out.println(aList);

        aList.remove(0);

        System.out.println(aList);
    }

}
