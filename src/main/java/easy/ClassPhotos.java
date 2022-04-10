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
     * O(nlogn) Time , O(1) space where n is the total students
     */
    public boolean classPhotos(ArrayList<Integer> redShirtHeights, ArrayList<Integer> blueShirtHeights) {
        Collections.sort(redShirtHeights);
        Collections.sort(blueShirtHeights);

        String frontGroup = redShirtHeights.get(0) < blueShirtHeights.get(0) ? "RED" : "BLUE";

        for(int i=0; i<redShirtHeights.size(); i++){
            if(frontGroup.equals("RED")){
                if(redShirtHeights.get(i) >= blueShirtHeights.get(i)) return false;
            }else{
                if(redShirtHeights.get(i) <= blueShirtHeights.get(i)) return false;
            }
        }

        return true;
    }
}
