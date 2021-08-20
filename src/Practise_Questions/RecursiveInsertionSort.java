package Practise_Questions;

public class RecursiveInsertionSort {

    public static void main(String[] args) {
        int[] array = {20, 35, -15, 7, 55, 1, -22};

        insertionsort(array, array.length);

//        for(int firstUnsortedIndex=0;firstUnsortedIndex<array.length;firstUnsortedIndex++){
//            int newElement = array[firstUnsortedIndex];
//            int i;
//
//            for(i=firstUnsortedIndex;i>0 && array[i-1]>newElement;i--){
//                array[i] = array[i-1];
//            }
//            array[i] = newElement;
//        }

        for(int n:array){
            System.out.println(n);
        }
    }

    public  static void insertionsort(int[] array, int numItems){
        if(numItems<2){
            return;
        }

        insertionsort(array, numItems-1);
        int newElement = array[numItems-1];
        int i;

        for(i=numItems-1;i>0 && array[i-1]>newElement;i--){
            array[i] = array[i-1];
        }
        array[i] = newElement;



        
    }
}
