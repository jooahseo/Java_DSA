package easy;

public class PalindromeCheck {
    public static void main(String[] args) {
        String input = "abcdcba";
        String input2 = "abcdefghhgfedcba";
        String input3 = "abcdefghihgfeddcba";

        System.out.println(isPalindrome(input));
        System.out.println(isPalindrome(input2));
        System.out.println(isPalindrome(input3));
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
}
