package easy;

import java.util.Hashtable;

public class FirstNonRepeatingChar {
    public static void main(String[] args) {
        String string = "abcdcaf";
        System.out.println(firstNonRepeatingCharacter(string)); // should return 1
        System.out.println(firstNonRepeatingCharacter2(string)); // should return 1
    }

    /**
     * Brute force approach
     * O(n^2) Time, O(1) space where n is the char count of string
     */
    public static int firstNonRepeatingCharacter(String string) {
        for(int i=0; i<string.length(); i++){
            boolean repeating = false;
            for(int j=0; j<string.length(); j++){
                if(string.charAt(i) == string.charAt(j) && i != j){
                    repeating = true;
                    break;
                }
            }
            if(!repeating) return i;
        }
        return -1;
    }

    /**
     * Optimized in time
     * O(n) Time, O(n) space
     */
    public static int firstNonRepeatingCharacter2(String string) {
        Hashtable<Character, Integer> freqTable = new Hashtable<>();
        for(int i=0; i<string.length(); i++){
            char currChar = string.charAt(i);
            if(freqTable.containsKey(currChar)){
                freqTable.put(currChar, freqTable.get(currChar) + 1);
            }else{
                freqTable.put(currChar, 1);
            }
        }
        for(int i=0; i<string.length(); i++){
            if(freqTable.get(string.charAt(i)) == 1) return i;
        }
        return -1;
    }
}
