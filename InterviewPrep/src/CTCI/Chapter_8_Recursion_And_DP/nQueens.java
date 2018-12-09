package CTCI.Chapter_8_Recursion_And_DP;

import java.awt.*;
import java.util.ArrayList;

public class nQueens {

    /**
     * Doesn't work
     */
    final static int GRID_SIZE = 8;

    public static void nQueens(int n){

        ArrayList<ArrayList<Point>> queens = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            queens.add(nQueens(0, i, new ArrayList<Point>()));
        }

        printWays(queens);
    }

    public static ArrayList<Point> nQueens(int r, int c, ArrayList<Point> queens){
        if(r == GRID_SIZE || c == GRID_SIZE){return null;}
        if(isSafe(queens, r, c)){
            queens.add(new Point(r, c));
        }

        nQueens(r, c + 1, queens);
        nQueens(r + 1, c, queens);
        if (queens.size() != GRID_SIZE){ return null;}
        return queens;
    }

    public static boolean isSafe(ArrayList<Point> queens, int r, int c){
        for (int i = 0; i < queens.size(); i++) {
            // check col and row
            if(r == queens.get(i).getX() || c == queens.get(i).getY()){
                return false;
            }
            // check diagonally
            if(Math.abs(queens.get(i).getX() - r) == Math.abs(queens.get(i).getY() - c)){
                return false;
            }
        }
        return true;
    }

    public static void printWays(ArrayList<ArrayList<Point>> queens){
        for (int i = 0; i < 8; i++) {
            if(queens.get(i) == null) continue;
            for (int j = 0; j < 8; j++) {
                Point p = queens.get(i).get(j);
                System.out.print("{ " + p.getX() + " } , { " + p.getY() + " } ,");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        nQueens(GRID_SIZE);
    }
}
