package RevisitingAlgo;

public class InsertionSort {
    public static void main(String[] args) {
//        int[] input = new int[5];
        int[] input = {25, 17, 31,13, 2};
        for(int n:insertionSort(input)){
            System.out.print(n+" ");
        }
    }

    public static int[] insertionSort(int[] input){
        System.out.println("Sorting...");
        for(int i=1;i< input.length;i++){
            int value=input[i];
            int j = i-1;
            while(j>=0 && input[j]>value){
                input[j+1]=input[j];
                j=j-1;
            }
            input[j+1]=value;
        }
        return input;
    }
}
