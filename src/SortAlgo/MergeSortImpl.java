package SortAlgo;

public class MergeSortImpl {
    public static void main(String[] args) {
        int[] array = {20, 35, -15, 7, 55, 1, -22};

        mergesort(array, 0, array.length);

        for (int j : array) {
            System.out.println(j);
        }
    }

    public static void mergesort(int[] array, int start, int end){
        if(end-start < 2){
            return;
        }

        int mid = (start+end)/2;
        mergesort(array, start, mid);
        mergesort(array, mid, end);
        merge(array, start, mid, end);
    }

    public static void merge(int[] array, int start, int mid, int end){
        if(array[mid-1]<=array[mid]){
            return;
        }

        int i = start;
        int j = mid;
        int tempIndex = 0;

        int[] temp = new int[end-start];
        while(i<mid && j<end){
            temp[tempIndex++] = array[i]<=array[j] ? array[i++]:array[j++];
        }

        System.arraycopy(array, i, array, start+tempIndex, mid-i);
        System.arraycopy(temp, 0, array, start, tempIndex);
    }
}
