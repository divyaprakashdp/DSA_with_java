package Practise_Questions;

public class PlusOne {
    public static void main(String[] args) {
        int[] d1 = {1,2,3};
        int[] d2 = {4,3,2,1};
        int[] d3 = {0};
        int[] d4 = {9};
        int[] d5 = {9,9,9};
        int[] d6 = {8,9,9};
        int[] d7 = {9,8,7,6,5,4,3,2,1,0};
        int[] d8 = {4,8,9,1};

//        for(int n:plusOne_OofN(d3)){
//            System.out.print(n+", ");
//        }

        for(int n:plusOne(d5)){
            System.out.print(n+", ");
        }

    }

    public static int[] plusOne_OofN(int[] digits) {
        long num = 0;
        int[] out;
        for(int i = 0;i< digits.length;i++){
            num += digits[i]*Math.pow(10,(digits.length-1-i));
        }
        num += 1;
        out = new int[String.valueOf(num).length()];

        for(int j= out.length-1;j>= 0;j--){
            out[j]= (int) (num%10);
            num=num/10;
        }
        return out;
    }

    public static int[] plusOne(int[] digits) {
        int len = digits.length;
        for (int i =len-1;i>=0;i--) {
            if (digits[i]!=9) {
                digits[i]++;
                return digits;
            }
            else{
                digits[i]=0;
            }
        }
        int[] arr= new int[len+1];
        if(digits[0]==0){
            arr[0]=1;
            System.arraycopy(digits, 0, arr, 1, len);
        }
        return arr;
    }
}
