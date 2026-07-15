package Graph;

import java.util.*;

public class DFS {
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer>ans=new ArrayList<>();
        boolean visited[]=new boolean[adj.size()];
        dfsHelper(0,ans,visited,adj);
        return ans;
    }
    void dfsHelper(int node,ArrayList<Integer>ans,boolean visited[],ArrayList<ArrayList<Integer>> adj) {
        visited[node]=true;
        ans.add(node);
        for(int neighbour:adj.get(node)) {
            if(!visited[neighbour]) {
                dfsHelper(neighbour,ans,visited,adj);
            }
        }
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

        DFS dfs=new DFS();
        ArrayList<Integer> result=dfs.dfs(adj);
        System.out.println(result);
    }
}
