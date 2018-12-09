package DataStructures.Graphs;

/**
 * Saves space O(V + E)
 *
 * Deleting and Adding vertices is O(V) - copy over old Node list
 *
 */
public class ListGraph {
    public Node[] nodes;
    public int size;
    public boolean isDirected = false;

    public ListGraph(int size, boolean isDirected){
        this.size = size;
        this.isDirected = isDirected;
        this.nodes = new Node[size];
    }

    public void addVertex(Node v){
        Node[] newNodes = new Node[size + 1];
        for (int i = 0; i < size; i++) {
            newNodes[i] = nodes[i];
        }
        newNodes[size] = v;
        this.size = size + 1;
        this.nodes = newNodes;
    }

    private class Node {
        public String name;
        public boolean visited;
        public Node[] adjacent;
        public Node(String name){
            this.name = name;
        }
        // if adding edge at a time O(E) to copy over edges into new edge list
        public void addEdge(){
            Node[] newAdjacent = new Node[adjacent.length + 1];
            for (int i = 0; i < adjacent.length; i++) {
                newAdjacent[i] = adjacent[i];
            }
            adjacent = newAdjacent;
        }

    }
}


