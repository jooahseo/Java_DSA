package easy;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(Fibonacci.getNthFib2(7));
    }
    /**
     * Recursive way O(2^n) time, O(n) space
     */
    public static int getNthFib(int n) {
        if(n == 1) return 0;
        if(n == 2) return 1;
        return getNthFib(n-1) + getNthFib(n-2);
    }

    /**
     * Iterative way - O(n) time, O(1) space
     */
    public static int getNthFib2(int n) {
        int first = 0;
        int second = 1;
        int newSum = 0;
        if(n == 1) return first;
        if(n == 2) return second;
        for(int i=2; i<n; i++){
            newSum = first + second;
            first = second;
            second = newSum;
        }
        return newSum;
    }

}
