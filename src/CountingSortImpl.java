public class CountingSortImpl {
    public static void main(String[] args) {
        int[] array = {2, 5, 9,8,2,8,7,10,4,3};

        countingsort(array, 1, 10);
        for(int n:array){
            System.out.println(n);
        }
    }

    public static void countingsort(int[] array, int min, int max){
        int[] temp= new int[max-min+1];
        for(int i = 0;i<array.length;i++){
            int index = array[i]-min;
            temp[index]++;
        }
        int j=0;
        for(int i = min;i<=max;i++){
            while(temp[i-min]>0){
                array[j++] = i;
                temp[i-min]--;
            }
        }
//        return temp;
    }
}
