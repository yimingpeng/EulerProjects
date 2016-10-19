package nz.ac.vuw.ecs.problems;

/**
 * This class represents the problem 15 of Project Euler
 * "Lattice paths"
 * Link:
 *      https://projecteuler.net/problem=15
 * Status:
 *      Correct
 * Answer:
 *      137846528820
 *
 * @author Yiming
 * @version 1.0.0
 * @date 19/10/16
 * @since 1.0.0
 */
public class Problem15 {
    //Wrong one
    /*private static int getNumOfRoutes(int gridSize){
        int diagonalPoints = gridSize - 1;
        int onePathsPoints = gridSize;
        int twoPathsPoints = (int)Math.pow(gridSize + 1, 2)/ 2 - diagonalPoints - onePathsPoints;
        return ((int)Math.pow(2, twoPathsPoints) + diagonalPoints) * 2;
    }*/
    //Wrong two
    /*private static int getNumOfRoutes(int gridSize){
        int onePathsPoints = 2 * gridSize;
        int fromAndToPoints = 2;
        int totalPoints = (gridSize + 1) * (gridSize + 1);
        return  (totalPoints - onePathsPoints - fromAndToPoints) * 2 + 2;
    }*/
    //Wrong three
    /*private static int getNumOfRoutes(int gridSize){
        //Only consider half
        int totalPoints = (gridSize + 1) * (gridSize + 1);
        int fromAndToPoints = 2;
        int onePathPoints = gridSize * 2;
        return (totalPoints - fromAndToPoints - onePathPoints ) * 2 + (onePathPoints - 2)/2;
    }*/
    /*private static String getNumOfRoutes(int gridSize){
        long diagonalPoints = gridSize - 1;
        long totalPoints = (gridSize + 1) * (gridSize + 1);
        long onePathPoints = gridSize * 2;
        long twoPathsPoints = (totalPoints - onePathPoints ) - diagonalPoints;

        String a = "" + (Math.pow(2,twoPathsPoints/2));
        BigDecimal bd = new BigDecimal(a);
        BigInteger aBig =  bd.toBigInteger();
        BigInteger bBig = new BigInteger("" + diagonalPoints * 2);
        return  aBig.add(bBig).toString();
    }*/
    private static long getNumOfRoutes(int gridSize){
        long[][] grid = new long[gridSize+1][gridSize+1];

        for (int i = 0; i < grid.length; i++) {
            grid[i][gridSize] = 1;
            grid[gridSize][i] = 1;
        }

        for (int i = gridSize - 1; i >= 0; i--) {
            for (int j = gridSize - 1; j >= 0 ; j--) {
                grid[i][j] = grid[i+1][j]  + grid[i][j+1];
            }
        }
        return grid[0][0];
    }
    public static void main(String[] args) {
        System.out.println(getNumOfRoutes(20));
    }
}
