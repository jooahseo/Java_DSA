package easy;

import java.util.Arrays;

public class MinimumWaitingTime {
    public static void main(String[] args) {
        MinimumWaitingTime m = new MinimumWaitingTime();
        System.out.println(m.minimumWaitingTime(new int[] {3,2,1,2,6}));
    }

    /**
     * O(logn)Time | O(1) space
     */
    public int minimumWaitingTime(int[] queries) {
        Arrays.sort(queries);
        int totalWaitingTime = 0;
        int currentCumulatedTime = 0;
        for(int i=0; i<queries.length-1; i++){
            currentCumulatedTime += queries[i];
            totalWaitingTime += currentCumulatedTime;
        }

        return totalWaitingTime;
    }
}
