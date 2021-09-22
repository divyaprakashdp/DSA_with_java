package Practise_Questions;

public class LengthOfLastWord {
    public static void main(String[] args) {
        String s = "Hello world";
        String s1 = "  Hello  World  ";

        System.out.println(lengthOfLastWord(s1).length());
    }

    public static String lengthOfLastWord(String s){
        String[] sDash = s.trim().split(" ");
        return sDash[sDash.length-1];
    }
}
