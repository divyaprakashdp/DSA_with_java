package Practise_Questions;

//Find the missing character

public class MissingLetter {
    public static void main(String[] args) {
        String testList = "abcdf";
        missingLetter(testList);
    }

    public static void missingLetter(String str){
        for(char i=str.charAt(0);i<=str.charAt(str.length()-1);i++){
            if(str.charAt(i-97)!=i){
                System.out.println(i);
                break;
            }
        }
    }
}
