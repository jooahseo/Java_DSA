package easy;

import java.util.ArrayList;
import java.util.List;

public class DepthFirstSearch {
    static class Node {
        String name;
        List<Node> children = new ArrayList<Node>();

        public Node(String name) {
            this.name = name;
        }

        /**
         * O(n) Time, O(n) space where n is node count
         */
        public List<String> depthFirstSearch(List<String> array) {
            array.add(this.name);
            for(Node child: this.children){
                child.depthFirstSearch(array);
            }
            return array;
        }

        public Node addChild(String name) {
            Node child = new Node(name);
            children.add(child);
            return this;
        }
    }
}
