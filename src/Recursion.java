import java.util.Objects;

public class Recursion {
    public static void main(String[] args) {
        System.out.println(stringReversal("Hallo"));
        palindrome("TENET");
        decToBinary(21);
    }

    private static void decToBinary(int i) {
    }

    private static void palindrome(String tenet) {
    }

    private static String stringReversal(String input) {
        if(input.equals("")){
            return "";
        }
        return stringReversal(input.substring(1))+input.charAt(0);
    }
}
