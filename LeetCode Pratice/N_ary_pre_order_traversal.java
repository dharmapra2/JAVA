import java.util.ArrayList;
import java.util.List;

// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};


class N_ary_pre_order_traversal {
    public List<Integer> preorder(Node root) {
       List<Integer> l=new ArrayList<>();
       if(root==null) return l;
       preorder(l,root);
       return l;
   }
   public void preorder(List<Integer> l,Node root){
       if(root==null)
           return ;
       l.add(root.val);
       for(Node r:root.children)
           preorder(l,r);
   }
}