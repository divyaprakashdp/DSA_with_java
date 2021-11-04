package RevisitingAlgo;

public class SelectionSort {
    public static void main(String[] args){
        int[] arr = {20, 35, -15, 7, 55, 1, -22};
        selectionSort(arr);
        for(int n:arr){
            System.out.println(n);
        }
    }

    public static void selectionSort(int[] array){
        for(int lastUnsortedIndex=array.length-1;lastUnsortedIndex>0;lastUnsortedIndex--){
            int largest = 0;
            for(int i=1;i<=lastUnsortedIndex;i++){
                if(array[i] > array[largest]){
                    largest=i;
                }
            }
            swap(array, largest, lastUnsortedIndex);
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
