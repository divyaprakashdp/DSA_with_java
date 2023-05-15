package PatternProblems;

public class RightAngle {
    public static void main(String[] args) {
        patternWithoutRecursion(5);
    }

    public static void patternWithoutRecursion(int colNo){
        for (int row=1;row<=colNo;row++){
            for (int col=1;col<=row;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

//    public static void pattern_With_Recursion(int colNo, ){
//        int row=1;
//        if(row<=colNo){
//            pattern_With_Recursion()
//        }
//    }
}
