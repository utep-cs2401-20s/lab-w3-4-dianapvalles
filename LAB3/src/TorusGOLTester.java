import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TorusGOLTester {

    /*
     * Test case 1:
     * neighbors(2,2) // row,col
     */

    @Test
    public void testGameOfLife1(){
        int[][] board = {{0,0,0,0,0},
                         {0,0,0,0,0},
                         {0,1,1,1,0},
                         {0,0,0,0,0},
                         {0,0,0,0,0}};

        GameOfLife sol = new GameOfLife(board);
        assertEquals(2, sol.neighbors(2,2));
    }

    /*
     * Test case 2:
     * neighbors(3, 2) // row, col
     */

    @Test
    public void testGameOfLife2(){
        int[][] board = {{0,0,0,0,0,0},
                         {0,0,0,0,0,0},
                         {0,0,1,1,1,0},
                         {0,1,1,1,0,0},
                         {0,0,0,0,0,0},
                         {0,0,0,0,0,0}};

        GameOfLife sol = new GameOfLife(board);
        assertEquals(4, sol.neighbors(3,2));
    }

    /*
     * Test case 3:
     * neighbors(2,3) // row, col
     */

    @Test
    public void testGameOfLife3(){
        int[][] board = {{0,0,0,0,0,0},
                         {0,1,1,0,0,0},
                         {0,1,1,0,0,0},
                         {0,0,0,1,1,0},
                         {0,0,0,1,1,0},
                         {0,0,0,0,0,0}};

        GameOfLife sol = new GameOfLife(board);
        assertEquals(4, sol.neighbors(2,3));
    }

    /*
     * Test case 4:
     * neighbors() // row,col
     */

    @Test
    //FIXME
    public void testGameOfLife4(){

    }

    /*
     * Test case 5:
     * neighbors(3,0) // row,col
     */

    @Test
    public void testGameOfLife5(){
        int[][] board = {{0,0,0,0,0},
                {0,1,1,1,0},
                {0,1,1,1,0},
                {0,1,0,0,0},
                {0,1,0,0,0}};

        GameOfLife sol = new GameOfLife(board);
        assertEquals(3, sol.neighbors(3,0));
    }

    /*
     * Test case 6:
     * oneStep()
     */

    @Test
    public void testGameOfLife6(){
        int[][] board = {{0,0,0,0,0},
                         {0,0,0,0,0},
                         {0,1,1,1,0},
                         {0,0,0,0,0},
                         {0,0,0,0,0}};

        int[][] boardExpected = {{0,0,0,0,0},
                                 {0,0,1,0,0},
                                 {0,0,1,0,0},
                                 {0,0,1,0,0},
                                 {0,0,0,0,0}};

        GameOfLife sol = new GameOfLife(board);
        sol.oneStep();
        assertEquals(boardExpected, sol.getBoard());
    }

    /*
     * Test case 7:
     * oneStep()
     */

    @Test
    public void testGameOfLife7(){
        int[][] board = {{0,0,0,0,0,0},
                         {0,0,0,0,0,0},
                         {0,0,1,1,1,0},
                         {0,1,1,1,0,0},
                         {0,0,0,0,0,0},
                         {0,0,0,0,0,0}};

        int[][] boardExpected = {{0,0,0,0,0,0},
                                 {0,0,0,1,0,0},
                                 {0,1,0,0,1,0},
                                 {0,1,0,0,1,0},
                                 {0,0,1,0,0,0},
                                 {0,0,0,0,0,0}};

        GameOfLife sol = new GameOfLife(board);
        sol.oneStep();
        assertEquals(boardExpected, sol.getBoard());
    }

    /*
     * Test case 8:
     * oneStep()
     */

    @Test
    public void testGameOfLife8(){
        int[][] board = {{0,0,0,0,0,0},
                         {0,1,1,0,0,0},
                         {0,1,1,0,0,0},
                         {0,0,0,1,1,0},
                         {0,0,0,1,1,0},
                         {0,0,0,0,0,0}};

        int[][] boardExpected = {{0,0,0,0,0,0},
                                 {0,1,1,0,0,0},
                                 {0,1,0,0,0,0},
                                 {0,0,0,0,1,0},
                                 {0,0,0,1,1,0},
                                 {0,0,0,0,0,0}};

        GameOfLife sol = new GameOfLife(board);
        sol.oneStep();
        assertEquals(boardExpected, sol.getBoard());
    }

    /*
     * Test case 9:
     * oneStep()
     */

    @Test
    //FIXME
    public void testGameOfLife9(){
        int[][] board = {{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                         {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                         {0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0},
                         {0,0,0,0,0,0,0,0,1,1,1,0,0,0,0,0,0,0,0},
                         {0,0,0,0,0,0,0,1,0,1,0,1,0,0,0,0,0,0,0},
                         {0,0,0,0,0,0,0,1,0,1,0,1,0,0,0,0,0,0,0},
                         {0,0,0,0,0,0,0,0,1,1,1,0,0,0,0,0,0,0,0},
                         {0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0},
                         {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                         {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                         {0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0},
                         {0,0,0,0,0,0,0,0,1,1,1,0,0,0,0,0,0,0,0},
                         {0,0,0,0,0,0,0,1,0,1,0,1,0,0,0,0,0,0,0},
                         {0,0,0,0,0,0,0,1,0,1,0,1,0,0,0,0,0,0,0},
                         {0,0,0,0,0,0,0,0,1,1,1,0,0,0,0,0,0,0,0},
                         {0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0},
                         {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                         {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                         {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}
                        };

        int[][] boardExpected = {{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                                 {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                                 {0,0,0,0,0,0,0,0,1,1,1,0,0,0,0,0,0,0,0},
                                 {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                                 {0,0,0,0,0,0,0,1,0,0,0,1,0,0,0,0,0,0,0},
                                 {0,0,0,0,0,0,0,1,0,0,0,1,0,0,0,0,0,0,0},
                                 {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                                 {0,0,0,0,0,0,0,0,1,1,1,0,0,0,0,0,0,0,0},
                                 {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                                 {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                                 {0,0,0,0,0,0,0,0,1,1,1,0,0,0,0,0,0,0,0},
                                 {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                                 {0,0,0,0,0,0,0,1,0,0,0,1,0,0,0,0,0,0,0},
                                 {0,0,0,0,0,0,0,1,0,0,0,1,0,0,0,0,0,0,0},
                                 {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                                 {0,0,0,0,0,0,0,0,1,1,1,0,0,0,0,0,0,0,0},
                                 {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                                 {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                                 {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}
                                };

        GameOfLife sol = new GameOfLife(board);
        sol.oneStep();
        assertEquals(boardExpected, sol.getBoard());
    }

    /*
     * Test case 10:
     * oneStep()
     */

    @Test
    public void testGameOfLife10(){
        int[][] board = {{0,0,0,0,0},
                         {0,1,1,1,0},
                         {0,1,1,1,0},
                         {0,1,0,0,0},
                         {0,1,0,0,0}};

        int[][] boardExpected = {{0,0,1,0,0},
                                 {0,1,0,1,0},
                                 {1,0,0,1,0},
                                 {1,1,0,0,0},
                                 {0,0,0,0,0}};

        GameOfLife sol = new GameOfLife(board);
        sol.oneStep();
        assertEquals(boardExpected, sol.getBoard());
    }

}
