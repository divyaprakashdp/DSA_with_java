package Practise_Questions;

import java.util.ArrayList;
import java.util.List;

public class GetMinCost {
    public static void main(String[] args) {
        List<Integer> crew_id = new ArrayList<>();
        List<Integer> job_id = new ArrayList<>();

        crew_id.add(5);
        crew_id.add(3);
        crew_id.add(1);
        crew_id.add(4);
        crew_id.add(6);

        job_id.add(9);
        job_id.add(3);
        job_id.add(1);
        job_id.add(15);
        job_id.add(8);

        System.out.println(getMinCost(crew_id, job_id));
    }

    public static long getMinCost(List<Integer> crew_id, List<Integer> job_id){
        long globalMin = 0;
        for(int i=0;i< crew_id.size();i++){
            int localMin=0;
            int templocalMin=0;
            for(int j=0;j< job_id.size();j++){
                int diff = Math.abs(crew_id.get(i)-job_id.get(j));

                if (templocalMin>localMin && i!=j){
                    localMin = diff;
                }
                templocalMin = diff;
            }
            globalMin += localMin;
        }
        return globalMin;
    }
}
