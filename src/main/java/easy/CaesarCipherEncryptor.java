package easy;

/**
 * Given a non-empty string of lowercase letters and a non-negative integer representing a key,
 * write a function that returns a new string obtained by shifting every letter
 * in the input string by k positions in the alphabet, where k is the key.
 */
public class CaesarCipherEncryptor {
    public static void main(String[] args) {
        String str = "xyz";
        int key = 2;
        System.out.println(caesarCypherEncryptor(str, key)); // expected "zab"
    }

    /**
     * O(n) Time and O(n) space, n is char count of str
     */
    public static String caesarCypherEncryptor(String str, int key) {
        if(key == 0) return str;
        //97 to 122 -> (char) 97 -> 'a'
        char[] characters = new char[str.length()];
        for(int i=0; i<str.length(); i++){
            characters[i] = getChar(str.charAt(i), key);
        }
        return new String(characters);
    }

    /**
     * Get the char's ascii code and add by the key
     * if it's more than 122 -> newCode - 122 = 100 % 26 = -> and add to 96
     */
    public static char getChar(char letter, int key){
        int newCode = letter + key;
        return newCode <= 122 ? (char) newCode : (char) ((newCode - 122) % 26 +96);
    }
}
