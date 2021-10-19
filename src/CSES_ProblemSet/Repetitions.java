package CSES_ProblemSet;

public class Repetitions {
    public static int repetitions(String input){
        char[] DNA_Sequence = input.toCharArray();
        int globalMax = 0;
        int localMax = 0;
        for(int i=1;i<DNA_Sequence.length;i++){
            char dnaChar = DNA_Sequence[i];
            char prevDnaChar = DNA_Sequence[i-1];
            if(prevDnaChar==dnaChar){
                localMax++;
            }

            if(localMax>globalMax){
                globalMax = localMax;
            }

        }
        return globalMax;
    }
}
