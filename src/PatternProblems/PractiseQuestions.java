package PatternProblems;

public class PractiseQuestions {
    public static void main(String[] args) {
//        pattern1(3);
//        pattern2(3);
        System.out.println(recursive_pattern(3));
    }

    private static String recursive_pattern(int i) {
        if(i==0){
            return "";
        }

        return recursive_pattern(i-1) + "*";
    }

    private static void pattern2(int rowNum) {
        for(int rowItr=0;rowItr<rowNum;rowItr++){
            for(int colItr=0;colItr<rowNum+2;colItr++){
//                if()
                System.out.print("* ");
            }
            System.out.println("");
        }
    }



    /**
     * @param rowNum
     * prints following pattern
     * *
     * * *
     * * * *
     */
    private static void pattern1(int rowNum) {
        for(int rowItr=0;rowItr<rowNum;rowItr++){
            for(int colItr=0;colItr<=rowItr;colItr++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }




}
