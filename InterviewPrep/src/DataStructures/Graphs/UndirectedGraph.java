package DataStructures.Graphs;

public class UndirectedGraph {
	
		/**
		 * Directed and Undirected - depends on the input -> adjList
		 */
        
        GraphNode[] vertices;
        int index;
        UndirectedGraph(int numOfVertices){
            vertices = new GraphNode[numOfVertices];
            index = 0;
        }
        
        public void addVertex(GraphNode vertex){
            if(index < vertices.length){
                vertices[index] = vertex;
                index++;
            }
        }
        
        public static void main(String[] args) {
        	UndirectedGraph graph = constructGraph();
		}
        
        public static UndirectedGraph constructGraph() {
        	int[][] adjList = {{1,2},{3},{3},{}};
        	UndirectedGraph graph = new UndirectedGraph(adjList.length);
        	
        	for(int i = 0; i < adjList.length; i++) {
        		graph.addVertex(new GraphNode(i,adjList[i].length));
        	}
        	
        	for(int i = 0; i < adjList.length; i++) {
        		System.out.print(i + " : ");
        		for(int j = 0; j < adjList[i].length; j++) {
        			int connectingVertex = adjList[i][j];
        			graph.vertices[i].addEdge(graph.vertices[connectingVertex]);
        			System.out.print(connectingVertex + " ");
        		}
        		System.out.println();
        	}
        	
        	return graph;
        }
        
        static class GraphNode{
            int data;
            GraphNode[] childern;
            boolean visited;
            int index;
            GraphNode(int data, int childernLength){
                this.data = data;
                childern = new GraphNode[childernLength];
                visited = false;
                index = 0;
            }
            
            public void addEdge(GraphNode edge){
                if(index < this.childern.length){ 
                    this.childern[index] = edge;
                    index++;
                }
            }
        }
        
    }
    


