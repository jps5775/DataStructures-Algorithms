package DataStructures.Graphs;


/**
 * Operations get, add, and delete Edge are O(1)
 *
 * Consumes more space O(V^2)
 *
 * Adding and Deleting vertices is O(V^2) because of copying over old matrix
 */
public class MatrixGraph {
    public boolean[][] matrix;
    public int size;
    public boolean isDirected = false;

    public MatrixGraph(int size, boolean isDirected){
        this.size = size;
        this.isDirected = isDirected;
        matrix = new boolean[size][size];
    }

    public void addVertex(int newSize){
        boolean[][] newMatrix = new boolean[newSize][newSize];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                newMatrix[i][j] = matrix[i][j];
            }
        }
        this.size = newSize;
        this.matrix = newMatrix;
    }

    public void addEdge(int u, int v){
        if(u >= size || v >= size || u < 0 || v < 0){
            System.out.println("Can't add Edge");
            return;
        }
        matrix[u][v] = true;
    }

    public void deleteEdge(int u, int v){
        if(u >= size || v >= size || u < 0 || v < 0){
            System.out.println("Can't delete Edge");
            return;
        }
        matrix[u][v] = false;
    }

    public boolean isEdgeBetween(int u, int v){
        if(u >= size || v >= size || u < 0 || v < 0){
            System.out.println("Can't check Edge");
            return false;
        }
        return matrix[u][v];
    }
}

