package easy;

import java.util.Arrays;

public class TandemBicycle {
    public static void main(String[] args) {
        TandemBicycle bicycle = new TandemBicycle();
        System.out.println(bicycle.tandemBicycle(new int[]{5,5,3,9,2}, new int[] {3,6,7,2,1}, true));
    }

    /**
     * O(n) time, O(1) space
     */
    public int tandemBicycle(int[] redShirtSpeeds, int[] blueShirtSpeeds, boolean fastest) {
        Arrays.sort(redShirtSpeeds);
        Arrays.sort(blueShirtSpeeds);

        int totalSpeed = 0;
        if(fastest){
            int bluePointer = blueShirtSpeeds.length-1;
            int redPointer = redShirtSpeeds.length-1;
            for(int i=0; i<blueShirtSpeeds.length; i++){
                if(blueShirtSpeeds[bluePointer] > redShirtSpeeds[redPointer]){
                    totalSpeed += blueShirtSpeeds[bluePointer];
                    bluePointer--;
                }else{
                    totalSpeed += redShirtSpeeds[redPointer];
                    redPointer--;
                }
            }
        }else{
            for(int i=0; i<redShirtSpeeds.length; i++){
                totalSpeed += Math.max(blueShirtSpeeds[i], redShirtSpeeds[i]);
            }
        }
        return totalSpeed;
    }
}
