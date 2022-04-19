package easy;

/**
 * Write a function that take in a non-empty string and returns it run-length encoding
 * run-length encoding is a form of lossless data compression in which runs of data are stored
 * as a single data value and count, rather than as the original run.
 * The input string can contain all sorts of special characters, including numbers.
 * Run of 10 or more characters should be encoded in a split fashion: "AAAAAAAAAAAA" -> "9A3A"
 */
public class RunLengthEncoding {
    public static void main(String[] args) {
        String str = "AAAAAAAAAAAAABBCCCCDD";
        System.out.println(runLengthEncoding(str)); //should return "9A4A2B4C2D"
    }

    /**
     * O(n) Time, O(n) Space where n is character count in the string
     * set currentChar to the first char of string -> loop through the str
     * if currentChar != str.charAt(i) OR currentCount == 9 -> add the string to the string builder as encoded format
     */
    public static String runLengthEncoding(String str){
        char currentChar = str.charAt(0);
        int currentCount = 1;
        StringBuilder encodedStr = new StringBuilder();
        for(int i=1; i<str.length(); i++){
            if(str.charAt(i) != currentChar || currentCount == 9){
                encodedStr.append(currentCount);
                encodedStr.append(currentChar);
                currentCount = 1;
                currentChar = str.charAt(i);
            }else{
                currentCount ++;
            }
        }
        encodedStr.append(currentCount);
        encodedStr.append(currentChar);

        return String.valueOf(encodedStr);
    }
}
