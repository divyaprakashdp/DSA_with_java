package Practise_Questions;

public class LetterCounter {
    public static void main(String[] args) {
        String inp = "The quick brown fox jumped over the lazy dog";
        String input1 = "What if we try a super-long word such as otorhinolaryngology";

        countWord(input1);
    }

    public static void countWord(String str){
        int globalCount = 0;
        int localCount = 0;
        for(int i =0;i<str.length();i++){
            if(str.charAt(i)!=' '){
                localCount++;
            }else if (str.charAt(i)==' '){
                if(globalCount<localCount){
                    globalCount = localCount;
                }
                localCount=0;
            }
        }
        if(globalCount<localCount){
            globalCount = localCount;
        }
        System.out.println(globalCount);
    }
}
