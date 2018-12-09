package CTCI.Chapter_8_Recursion_And_DP;


public class RoboGrid {

    public static boolean roboGrid(int[][] grid){
        return roboGrid(grid, 0, 0);
    }

    public static boolean roboGrid(int[][] grid, int r, int c){
        if(r > grid.length - 1){return false;}
        else if(c > grid[0].length - 1){return false;}
        else if(grid[r][c] == -1){return false;}
        else if(r == grid.length - 1 && c == grid[0].length - 1){return true;}
        else{
            return roboGrid(grid, r, c + 1) || roboGrid(grid, r + 1, c);
        }
    }

    public static void main(String[] args) {
        int[][] grid =
                {
                        {0, 0, 0, -1, 0},
                        {0, 0, 0, -1, 0},
                        {0, -1, -1, 0, 0},
                        {0, 0, 0, -1, 0},
                };

        System.out.println(roboGrid(grid));
    }

}
