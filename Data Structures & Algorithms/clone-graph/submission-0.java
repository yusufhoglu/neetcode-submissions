/*
Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {
        if(node == null) return null;

        Map<Node, Node> newMap = new HashMap<>();
        Queue<Node> q = new LinkedList<>();
        newMap.put(node, new Node(node.val));
        q.add(node);

        while (!q.isEmpty()) {
            Node cur = q.poll();
            for (Node neig: cur.neighbors) {
                if (!newMap.containsKey(neig)) {
                    newMap.put(neig, new Node(neig.val));
                    q.add(neig);
                }
                newMap.get(cur).neighbors.add(newMap.get(neig));
            }
        }        
        return newMap.get(node);
    }
}