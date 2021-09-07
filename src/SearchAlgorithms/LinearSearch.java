package SearchAlgorithms;

public class LinearSearch {
    public static void main(String[] args) {
        int[] input = {56,444,41,0,11};
        System.out.println(linearIntSearch(44, input));
        System.out.println(linearIntSearch(41, input));
    }

    public static int linearIntSearch(int value, int[] input){
        for(int i=0;i< input.length;i++){
            if(input[i]==value){
                return i+1;
            }
        }
        return -1;
    }
}
