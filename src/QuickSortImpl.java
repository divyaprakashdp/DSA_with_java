public class QuickSortImpl {
    public static void main(String[] args) {
        int[] array = {20, 35, -15, 7, 55, 1, -22};

        quicksort(array, 0, 6);

        for(int n:array){
            System.out.println(n);
        }
    }
    public static void quicksort(int[] array, int start, int end){
        if(end-start<2){
            return;
        }
        int partitionIndex = partition(array, start, end);
        quicksort(array, start, partitionIndex-1);
        quicksort(array,  partitionIndex+1, end);
    }

    public static void swap(int[] array, int i, int j){
        if(i==j){
            return;
        }

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    //20, 35, -15, 7, 55, 1, -22
    public static int partition(int[] array, int start, int end){
        int pivot = array[end];
        int partitionIndex = start;
        for(int i=start;i<end;i++){
            if(array[i]<=pivot){
                swap(array, i, partitionIndex);
                partitionIndex++;
            }
        }
        swap(array, partitionIndex, end);
        return partitionIndex;
    }
}
