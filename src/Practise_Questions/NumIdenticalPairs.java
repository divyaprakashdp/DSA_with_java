package Practise_Questions;

public class NumIdenticalPairs {

    public static void main(String[] args) {
        int[] nums = {1,2,3,1,1,3};

        System.out.println(numIdenticalPairs(nums));
    }
//naive solution
    public static int numIdenticalPairs(int[] nums){
        int out =0;
        for(int i=0;i< nums.length;i++){
            for(int j=i+1;j<nums.length;j++){

                if(nums[i]==nums[j]){
                    out++;

                }
            }
        }
        return out;
    }
}
