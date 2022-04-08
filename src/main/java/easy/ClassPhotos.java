package easy;

import java.util.ArrayList;
import java.util.Collections;

/**
 * All student wearing red shirts must be in the same row
 * All student wearing blue shirts must be in the same row
 * Each student in the back row must be strictly taller than the student directly in front of them in the front row
 * red shirt students count == blue shirt students count
 */
public class ClassPhotos {
    /**
     * O(nlogn) Time , O(n) space where n is the total students
     */
    public boolean classPhotos(ArrayList<Integer> redShirtHeights, ArrayList<Integer> blueShirtHeights) {
        Collections.sort(redShirtHeights);
        Collections.sort(blueShirtHeights);

        ArrayList<Integer> tallerGroup = new ArrayList<>();
        ArrayList<Integer> smallerGroup = new ArrayList<>();

        if(redShirtHeights.get(redShirtHeights.size() - 1) > blueShirtHeights.get(blueShirtHeights.size() - 1)){
            tallerGroup = redShirtHeights;
            smallerGroup = blueShirtHeights;
        }else if(redShirtHeights.get(redShirtHeights.size() - 1) < blueShirtHeights.get(blueShirtHeights.size() - 1)){
            tallerGroup = blueShirtHeights;
            smallerGroup = redShirtHeights;
        }else if(redShirtHeights.get(redShirtHeights.size() - 1) == blueShirtHeights.get(blueShirtHeights.size() - 1)){
            return false;
        }

        for(int i=tallerGroup.size()-1; i>=0; i--){
            if(tallerGroup.get(i) <= smallerGroup.get(i)) return false;
        }

        return true;
    }
}
