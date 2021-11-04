package SortAlgo;

public class BubbleSortImpl {
    public static void main(String[] args) {
        int[] array = {20, 35, -15, 7, 55, 1, -22};
        final long startTime = System.nanoTime();
        for(int lastUnsortedIndex = array.length-1; lastUnsortedIndex>0; lastUnsortedIndex--){
            for(int i=0; i<lastUnsortedIndex;i++){
                if(array[i] > array[i + 1]){
                    swap(array, i, i+1);
                }
            }
        }
        final long duration = System.nanoTime() - startTime;
        System.out.println("time taken to sort: "+duration);

        for(int n:array){
            System.out.println(n);
        }

    }

    public static void swap(int[] array, int i, int j){
        if(i==j){
            return;
        }

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    public static boolean compare(int[] array, int i){
        return array[i] > array[i + 1];
    }


}
