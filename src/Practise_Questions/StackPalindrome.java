package Practise_Questions;

import java.util.Deque;
import java.util.LinkedList;

public class StackPalindrome {

    public static void main(String[] args) {
//        System.out.println(checkPalindrome("TENET"));
        System.out.println(checkforPalindrome("TEn NET?"));
    }

    public static boolean checkPalindrome(String input){
        StringBuilder strNospecialChar = new StringBuilder(input.length());
        String inputLower = input.toLowerCase();
        LinkedList<Character> stack = new LinkedList<>();
        for(int i=0;i<input.length();i++){
            char c = inputLower.charAt(i);
            if(c>'a' && c<'z'){
                strNospecialChar.append(c);
                stack.push(c);
            }
        }

        StringBuilder reversedInput = new StringBuilder(stack.size());
        while(!stack.isEmpty()){
            reversedInput.append(stack.pop());
        }
        return reversedInput.toString().equals(strNospecialChar.toString());
    }

    public static boolean checkforPalindrome(String input){
        input = input.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        System.out.println(input);
        int len = input.length();
        int itr = len-1;
        LinkedList<Character> firstHalf = new LinkedList<>();
        LinkedList<Character> secondHalf = new LinkedList<>();
        for(int i=0;i<len/2;i++){
            firstHalf.push(input.charAt(i));
            secondHalf.push(input.charAt(itr--));
        }
        System.out.println(firstHalf);
        System.out.println(secondHalf);
        return firstHalf.equals(secondHalf);
    }
}
