package DataStructures.DefaultGraph;

public class GraphNode{
    public String name;
    public boolean visited;
    public GraphNode[] adjacent;
    public GraphNode(String name){
        this.name = name;
    }
}