package Tree;

import java.util.LinkedList;
import java.util.Queue;

class Node{
    Node left;
    Node right;
    int data;
    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
public class BFS {
    }
    public static void main(String[] args) {
        // BFS is a level order traversal of a tree
        // It uses a queue to keep track of the nodes to be visited
        // It starts from the root node and visits all the nodes at the same level before moving to the next level

        Node root = new Node(1);

        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.right.right = new Node(6);
        bfs(root);
    }
    public static void bfs(Node root) {
        if(root ==null) return;
        Queue<Node>q=new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            Node curr=q.poll();
            System.out.print(" "+curr.data+" -->");

            if(curr.left!=null) q.add(curr.left);
            if(curr.right!=null) q.add(curr.right);
        }
    }
}
