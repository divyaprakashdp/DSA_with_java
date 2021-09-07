package SearchAlgorithms;

public class IterativeBinarySearch {

    public static void main(String[] args) {
        int[] input = {56,444,41,0,11};
        System.out.println(iterativeBinarySearch(44, input));
        System.out.println(iterativeBinarySearch(41, input));
    }

    public static int iterativeBinarySearch(int value, int[] input){
        int start = 0;
        int end = input.length;
        while(start<end){
            int midpoint = (start+end)/2;
            if(input[midpoint] == value){
                return midpoint+1;
            }else if(input[midpoint]<value){
                start = midpoint+1;
            }else{
                end = midpoint;
            }
        }
        return -1;
    }
}
