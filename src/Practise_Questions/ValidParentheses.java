package Practise_Questions;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;

public class ValidParentheses {

    public static void main(String[] args) {
        System.out.println(isValid("((({[}]})))"));//false
        System.out.println(isValid("((({})))"));//true
        System.out.println(isValid("((({}))[])"));//true
        System.out.println(isValid("()[]{}"));//true
    }

    public static boolean isValid(String s){
        Deque<Character> bracketStack = new LinkedList<>();

        for(int i=0;i<s.length();i++){

            char x = s.charAt(i);

            if(x=='(' || x=='{' || x=='['){
                bracketStack.push(x);
            }else if((x==')' && !bracketStack.isEmpty() && bracketStack.peek()=='(' )
                    || (x=='}' && !bracketStack.isEmpty() && bracketStack.peek()=='{')
                    || (x==']' && !bracketStack.isEmpty() && bracketStack.peek()=='[' )){
                bracketStack.pop();
            }else{
                return false;
            }
        }
        return bracketStack.isEmpty();
    }
}
