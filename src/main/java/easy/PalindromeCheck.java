package easy;

public class PalindromeCheck {
    public static void main(String[] args) {
        String input = "abcdcba";
        String input2 = "abcdefghhgfedcba";
        String input3 = "abcdefghihgfeddcba";

        System.out.println(isPalindrome(input));
        System.out.println(isPalindrome(input2));
        System.out.println(isPalindrome(input3));

        System.out.println(isPalindrome2(input));
        System.out.println(isPalindrome2(input2));
        System.out.println(isPalindrome2(input3));
    }

    /**
     * Use pointer left and right -> if unmatched char found, return false
     * O(n) Time, O(1) Space
     */
    public static boolean isPalindrome(String str){
        int left = 0;
        int right = str.length()-1;
        while(left <= right){
            if(str.charAt(left) != str.charAt(right)){
                return false;
            }
            left ++;
            right--;
        }
        return true;
    }

    /**
     * Using StringBuilder
     * O(n) Time, O(n) Space
     */
    public static boolean isPalindrome2(String str){
        StringBuilder reversedString = new StringBuilder();
        for(int i=str.length()-1; i>=0; i--){
            reversedString.append(str.charAt(i));
        }
        return str.equals(reversedString.toString());
    }
}
