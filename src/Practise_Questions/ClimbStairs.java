package Practise_Questions;

public class ClimbStairs {
    public static void main(String[] args) {
        int n1 = 1;
        int n2 = 2;
        int n3 = 3;

        System.out.println(climbStairs(n3));
    }

    public static int climbStairs(int n){

        if (n==1) return 1;

        if(n%2==0){
            return (n/2)+1;
        }else{
            return n/2;
        }
    }
}

