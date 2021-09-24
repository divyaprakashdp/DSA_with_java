package Practise_Questions;

import java.util.Arrays;

public class AddBinary {
    public static void main(String[] args) {
        String a = "1111";
        String b = "1111";

        System.out.println(addBinary(a,b));
    }

    public static String addBinary(String a, String b){
        StringBuilder output = new StringBuilder();
        int[] out = sum(a, b);
        for(int n:out){
            output.append(n);
        }
        return output.toString();
    }
// NEEDS TO BE UPDATED
    public static int[] sum(String a, String b){
        int a1 = Integer.parseInt(a);
        int b1 = Integer.parseInt(b);
        int remainder = 0;
        int psudoSum = a1+b1;
        int[] sum = new int[Math.max(a.length(),b.length())];
        int len = sum.length;
        int incr = 1;
        while(psudoSum>0){

            int chunk = psudoSum%10;
            if(chunk==2 || chunk==3){
                remainder = 1;
                sum[len-incr]=0;

            }else{
                sum[len-incr] = chunk;
            }
            incr++;
            psudoSum = psudoSum/10;
            if(remainder == 1 && psudoSum!=0){
                psudoSum +=1;
            }

        }
        int[] newSum;
        if((sum[0]==0 || sum[0]==3) && remainder==1){
            newSum = new int[len+1];
            newSum[0]=1;
//            newSum[1]=0;
            System.arraycopy(sum, 1, newSum, 2, len-1);
            return newSum;
        }

        return sum;
    }
}
