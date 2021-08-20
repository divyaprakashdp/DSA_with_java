package Practise_Questions;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class A2B2C3 {
    public static void main(String[] args) {
        String inp = "aabbccca";
        int count=1;
        StringBuilder out = new StringBuilder();
        for(int i=1;i<inp.length();i++){
            if(inp.charAt(i)==inp.charAt(i-1)){
                count++;

            }else{

                out.append(inp.charAt(i-1));
                out.append(count);
                count=1;
            }

        }
        out.append(inp.charAt(inp.length()-1));
        out.append(count);
        System.out.print(out);
    }
}
