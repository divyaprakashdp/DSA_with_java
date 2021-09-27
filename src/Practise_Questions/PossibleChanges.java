package Practise_Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PossibleChanges {
    public static void main(String[] args) {
        List<String> username = new ArrayList<>();
        username.add("BeeBom");
        username.add("Bee");
        System.out.println(possibleChanges(username));
    }
    public static List<String> possibleChanges(List<String> usernames) {
        List<String> out = new ArrayList<>();
        for(String st : usernames){

            if(isSorted(st)){
                out.add("NO");
            }else{
                out.add("YES");
            }

        }

        return out;

    }
    public static boolean isSorted(String in){
        String[] temp = in.split("");
        String[] temp1 = in.split("");
        Arrays.sort(temp1);
        return Arrays.equals(temp, temp1);
    }
}
