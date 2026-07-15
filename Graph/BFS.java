package Graph;
import java.util.*;
public class BFS {
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        int V=adj.size();
        ArrayList<Integer> ans=new ArrayList<>();
        Queue<Integer>q=new LinkedList<>();
        boolean []visited=new boolean[V];

        visited[0]=true;
        q.offer(0);
        while(!q.isEmpty()) {
            int node=q.poll();
            ans.add(node);
            for(int neighbours:adj.get(node)) {
                if(!visited[neighbours]) {
                    visited[neighbours]=true;
                    q.offer(neighbours);
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        int V=5;
        for(int i=0;i<V;i++) {
            adj.add(new ArrayList<>());
        }
        adj.get(0).add(1);
        adj.get(0).add(2);
        adj.get(1).add(0);
        adj.get(1).add(3);
        adj.get(1).add(4);
        adj.get(2).add(0);
        adj.get(3).add(1);
        adj.get(4).add(1);

        BFS bfs=new BFS();
        ArrayList<Integer> result=bfs.bfs(adj);
        System.out.println(result);
    }
}