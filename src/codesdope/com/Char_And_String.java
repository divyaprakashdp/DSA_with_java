package codesdope.com;

import java.util.*;
import java.util.stream.Collectors;

public class Char_And_String {
    /* Questions from https://www.codesdope.com/practice/java-characters-and-string/ */

    //Write a program to print a string entered by user.
    public static void question1(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String out = sc.next();
        System.out.println(out);
    }

    //Write a program to input and display the sentence I love candies.
    public static void question2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Sentence");
        String out = sc.next();
        System.out.println(out);
    }

    //Write a program to find the length of the string "refrigerator".
    public static void question3(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word to get the length");
        String out = sc.next();
        System.out.println(out.length());
    }

    //Write a program to check if the letter 'e' is present in the word 'Umbrella'.
    public static void question4(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence");
        String word = sc.nextLine();
        System.out.println("Enter the char");
        String input = sc.nextLine();
        boolean out = word.contains(input);
        System.out.println(out);
    }

    //Write a program to check if the word 'orange' is present in the "This is orange juice".
    public static void question5(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence");
        String word = sc.nextLine();
        System.out.println("Enter the word");
        String input = sc.nextLine();
        boolean out = word.contains(input);
        System.out.println(out);
    }

    //Write a program to find the first and the last occurence of the letter 'o' and character ',' in "Hello, World".
    public static void question6(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String word = sc.nextLine();
        System.out.println("Enter a char");
        String character = sc.nextLine();
        int index = 0;
        for(char c:word.toCharArray()){
            index++;
            if(c==character.charAt(0)){
                System.out.println("First index of the char - "+index);
                break;
            }
        }

        for(int last=word.length()-1;last>=0;last--){

            if(character.charAt(0)==word.charAt(last)){
                System.out.println("Last index of the char - "+last);
                break;
            }
        }
    }

    /*
    Write a program that takes your full name as input and
    displays the abbreviations of the first and
    middle names except the last name
    which is displayed as it is.
    For example, if your name is Robert Brett Roser,
    then the output should be R.B.Roser.
    */
    public static void question7(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your full name");
        String fullName = sc.nextLine();
        String[] fullNameArray = fullName.split(" ");
        int nameLength = fullNameArray.length;
        String name = "";
        for(int i=0;i<nameLength-1;i++){
            name += fullNameArray[i].charAt(0)+". ";
        }
        name += fullNameArray[nameLength-1];
        System.out.println(name);
    }

    //Write a program to find the number of vowels, consonants, digits and white space characters in a string.
    public static void question8(){
        int countOfVowel = 0;
        int countOfConsonant = 0;
        int countOfDigits = 0;
        int countOfWhiteSpace = 0;
        HashMap<String, Integer> result = new HashMap<>();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String fullName = sc.nextLine();
        for(char c:fullName.toCharArray()){
            if(Character.isLetter(c)){
                if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
                    countOfVowel++;
                }else{
                    countOfConsonant++;
                }
                
            }else if(Character.isWhitespace(c)){
                countOfWhiteSpace++;
            } else if (Character.isDigit(c)) {
                countOfDigits++;
            }
        }
        result.put("vowel", countOfVowel);
        result.put("consonant", countOfConsonant);
        result.put("digits", countOfDigits);
        result.put("white_space", countOfWhiteSpace);
        result.forEach((k,v)->System.out.println(k+":"+v));

    }

    //Write a program to delete all consonents from the string "Hello, have a good day"
    public static void question9(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String text = sc.nextLine();
        List<Character> textArray = new ArrayList<Character>();
        char[] letter = text.toCharArray();

        for(char c:letter){
            if(Character.isLetter(c)){
                if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
                    textArray.add(c);
                }
            }else{
                textArray.add(c);
            }
        }
        String result = textArray.stream().map(Object::toString).collect(Collectors.joining());
        System.out.println(result);

    }

    //Input a string of alphabets. Find out the number of occurrence of all alphabets in that string. Find out the alphabet with maximum occurrence.
    public static void question10(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String text = sc.nextLine();
        Map<String, Integer> result = new HashMap<>();
        for(String letter:text.split("")){
            if(!result.containsKey(letter)){
                result.put(letter, 1);
            }else{
                result.put(letter,result.get(letter)+1);
            }
        }
        result.forEach((k,v)->System.out.println(k+":"+v));
    }
}
