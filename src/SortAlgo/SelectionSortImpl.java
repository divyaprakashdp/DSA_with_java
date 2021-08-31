package SortAlgo;

public class SelectionSortImpl {
    public static void main(String[] args) {
        int[] array = {20, 35, -15, 7, 55, 1, -22};

        int lastUnsortedIndex;
        for(lastUnsortedIndex=array.length-1;lastUnsortedIndex>0;lastUnsortedIndex--){
            int largest=0;
            for(int i=1;i<=lastUnsortedIndex;i++){
                if(array[i] > array[largest]){
                    largest = i;
                }
            }
            swap(array, largest, lastUnsortedIndex);
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
}
