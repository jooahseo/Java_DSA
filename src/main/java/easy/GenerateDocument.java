package easy;

import java.util.HashMap;

public class GenerateDocument {
    public static void main(String[] args) {
        String characters = "Bste!hetsi ogEAxpelrt x ";
        String document = "AlgoExpert is the Best!";
        String characters2 = " ";
        String document2 = "hello";
        System.out.println(generateDocument(characters, document)); // expect 'true'
        System.out.println(generateDocument(characters2, document2)); // expect 'false'
    }

    /**
     * O(n) time and O(c) space where n is the char count of Max(characters.length, document,length)
     * c is the number of unique string in characters
     */
    public static boolean generateDocument(String characters, String document){
        HashMap<Character,Integer> charCount = new HashMap<Character, Integer>();
        for(int i=0; i<characters.length(); i++){
            char currentChar = characters.charAt(i);
            if(charCount.get(currentChar) == null){
                charCount.put(currentChar, 1);
            }else{
                charCount.put(currentChar, charCount.get(currentChar) + 1);
            }
        }
        for(int i=0; i<document.length(); i++){
            char currentChar = document.charAt(i);
            if(charCount.get(currentChar) == null || charCount.get(currentChar) == 0){
                return false;
            }else{
                charCount.put(currentChar, charCount.get(currentChar) -1);
            }
        }

        return true;
    }
}
