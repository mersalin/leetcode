/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
public Node connect(Node root) {
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        
        while (!q.isEmpty())
        {
            int size = q.size();
            Node last = null;
            for (int i=0;i<size;i++)
            {
                
                Node n = q.poll();
                if (n== null)
                {
                    continue;
                }
                
                if (last != null)
                {
                    last.next = n;
                }
                
                last = n;
                if (n.left!=null)
                {
                    q.add(n.left);
                }
                
                if (n.right!=null)
                {
                    q.add(n.right);
                }
            }
        }
        
        return root;
    }
}