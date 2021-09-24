package Practise_Questions;

public class MySqrt {
    public static void main(String[] args) {
        int num = 8;
        System.out.println(mysqrt(num));
    }

    public static int mysqrt(int num){
        int oddInt = 1;
        int sqrt = 0;
        while(num>=oddInt){
            num = num-oddInt;
            oddInt +=2;
            sqrt++;
        }
        return sqrt;
    }
}
