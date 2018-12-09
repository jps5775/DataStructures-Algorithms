package CTCI.Chapter_8_Recursion_And_DP;

public class PaintFill {

    enum Color{ BLACK, WHITE, RED, YELLOW, GREEN }

    public static boolean fill(Color[][] screen, int r, int c, Color newColor){
        if(screen[r][c] == newColor) return false;
        return fill(screen, r, c, screen[r][c], newColor);
    }

    public static boolean fill(Color[][] screen, int r, int c, Color oldColor, Color newColor){

        if(r == screen.length || r < 0 || c == screen[0].length || c < 0){
            return false;
        }

        if(screen[r][c] == oldColor){
            screen[r][c] = newColor;

            fill(screen, r + 1, c, oldColor, newColor);
            fill(screen, r - 1, c, oldColor, newColor);
            fill(screen, r, c + 1, oldColor, newColor);
            fill(screen, r, c - 1, oldColor, newColor);
        }

        return true;
    }




    public static void main(String[] args) {
        Color[][] grid =
                {
                        {Color.RED, Color.RED, Color.RED, Color.RED, Color.RED},
                        {Color.RED, Color.BLACK, Color.BLACK, Color.BLACK, Color.RED},
                        {Color.RED, Color.BLACK, Color.BLACK, Color.BLACK, Color.RED},
                        {Color.RED, Color.RED, Color.RED, Color.RED, Color.RED},
                };
        System.out.println(fill(grid, 0, 0, Color.GREEN));

        for (int i = 0; i < grid.length; i++){
            for (int j = 0; j < grid[0].length; j++){
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }


}
