package DataStructures.DefaultGraph;

// Undirected Graph

public class DefaultGraph {

    public GraphNode root[]; // list of all nodes

    public DefaultGraph(){
        /**
         *
         *  Node(A) - Node(B) - Node(C)
         *  | |           |       |
         *  |  --------|  |       |
         *  Node(D)   Node(E) - Node(F)
         *              | |
         *              |  -------|
         *             Node(G) - Node(H)
         *
         */
        root = createGraph();
    }

    private GraphNode[] createGraph(){
        GraphNode[] one = new GraphNode[]{
                new GraphNode("A"),new GraphNode("B"),new GraphNode("C"),
                new GraphNode("D"),new GraphNode("E"),
                new GraphNode("F"),new GraphNode("G"), new GraphNode("H")};

        one[0].adjacent = new GraphNode[]{one[1], one[4], one[3]};
        one[1].adjacent = new GraphNode[]{one[0], one[2], one[4]};
        one[2].adjacent = new GraphNode[]{one[1], one[5]};
        one[3].adjacent = new GraphNode[]{one[0]};
        one[4].adjacent = new GraphNode[]{one[0], one[1], one[5], one[6], one[7]};
        one[5].adjacent = new GraphNode[]{one[2], one[4]};
        one[6].adjacent = new GraphNode[]{one[4], one[7]};
        one[7].adjacent = new GraphNode[]{one[4], one[6]};

        return one;
    }
}
