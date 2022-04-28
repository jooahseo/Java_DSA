package easy;

import java.util.HashSet;

public class FirstNonRepeatingChar {
    public static void main(String[] args) {
        String string = "abcdcaf";
        System.out.println(firstNonRepeatingCharacter(string)); // should return 1
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
}
