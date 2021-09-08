package SearchAlgorithms;

public class RecursiveBinarySearch {
    public static void main(String[] args) {
        int[] input = {56,444,41,0,11};
        System.out.println(recursiveBinarySearch(44, 0, input.length, input));
        System.out.println(recursiveBinarySearch(41, 0, input.length, input));
    }

    public static int recursiveBinarySearch(int value, int start, int end, int[] input){

        if(start<end){
            return -1;
        }
            int midpoint = (start+end)/2;
            if(input[midpoint] == value){
                return midpoint+1;
            }else if(input[midpoint]<value){
                return recursiveBinarySearch(value, midpoint+1, end, input);
            }else{
                return recursiveBinarySearch(value, start, midpoint, input);
            }


    }
}
