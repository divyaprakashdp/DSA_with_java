package SortAlgo;

public class BubbleSortImpl {
    public static void main(String[] args) {
        int[] array = {20, 35, -15, 7, 55, 1, -22};
        for(int lastunsortedIndex = array.length-1; lastunsortedIndex>0; lastunsortedIndex--){
            for(int i=0; i<array.length-1;i++){
                if(compare(array, i)){
                    swap(array, i, i+1);
                }
            }
        }

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
