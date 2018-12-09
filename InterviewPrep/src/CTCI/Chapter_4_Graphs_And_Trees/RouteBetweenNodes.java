package CTCI.Chapter_4_Graphs_And_Trees;

import java.util.LinkedList;
import java.util.Queue;

import DataStructures.DefaultGraph.DefaultGraph;
import DataStructures.DefaultGraph.GraphNode;

public class RouteBetweenNodes {

    // DFS solution works

    public static boolean routeDFS(GraphNode start, GraphNode end){
        if(start == null || end == null){return false;}
        else if(start == end){return true;}

        start.visited = true;
        if(start.adjacent == null){return false;}
        for (GraphNode n : start.adjacent) {
            if(!n.visited){
                System.out.println(n.name);
                if(routeDFS(n, end)){return true;}
            }
        }

        return false;
    }

    // normal Depth First Search

    public static void dfs(GraphNode start){
        if(start == null){return;}
        start.visited = true;
        if(start.adjacent == null){return;}
        for (GraphNode n : start.adjacent) {
            if(!n.visited){
                System.out.println(n.name);
                dfs(n);
            }
        }

    }

    // BFS solution

    public static boolean routeBFS(GraphNode start, GraphNode end){
    		if(start == null || end == null) { return false; }
    		if(start == end) { return true; }
		
    		Queue<GraphNode> queue = new LinkedList<GraphNode>();
    		start.visited = true;
    		queue.add(start);
    		
    		while(!queue.isEmpty()) {
    			GraphNode removed = queue.remove();
    			for(GraphNode n : removed.adjacent) {
    				System.out.println(removed.name + ": " + n.name);
    				if(n == end) { return true; }
    				if(!n.visited) {
    					queue.add(n);
    					n.visited = true;
    				}
    			}
    		}
    		
    		return false;
    		
    }
    
    // normal Breadth First Search
    
    public static boolean bfs(GraphNode start){
		if(start == null) { return false; }
	
		Queue<GraphNode> queue = new LinkedList<GraphNode>();
		start.visited = true;
		queue.add(start);
		
		while(!queue.isEmpty()) {
			GraphNode removed = queue.remove();
			for(GraphNode n : removed.adjacent) {
				if(!n.visited) {
					queue.add(n);
					n.visited = true;
				}
			}
		}
		
		return false;
		
    }

    public static void main(String[] args) {

        DefaultGraph g = new DefaultGraph();
        System.out.println(routeBFS(g.root[0], g.root[7]));

    }
}
