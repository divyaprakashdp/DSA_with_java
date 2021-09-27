package Practise_Questions;

public class ClimbStairs {
    public static void main(String[] args) {
        int n1 = 1;
        int n2 = 2;
        int n3 = 3;

        System.out.println(climbStairs(11));
    }

    public static int climbStairs(int n){

        if (n<=1) return 1;

        int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;

        for(int i=3;i<=n; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }

        return dp[n];

    }
}

