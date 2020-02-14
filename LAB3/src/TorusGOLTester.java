import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TorusGOLTester {

    /*
     * GameOfLife Tests
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
     * GameOfLife Tests
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
     * GameOfLife Tests
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
     * GameOfLife Tests
     * Test case 4:
     * neighbors(5, 9) // row,col
     */

    @Test
    public void testGameOfLife4(){
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

        GameOfLife sol = new GameOfLife(board);
        assertEquals(4, sol.neighbors(5,9));
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
     * GameOfLife Tests
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
     * GameOfLife Tests
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
     * GameOfLife Tests
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
     * GameOfLife Tests
     * Test case 9:
     * oneStep()
     */

    @Test
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
     * GameOfLife Tests
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

    /*
     * GameOfLife Tests
     * Test case 11:
     * evolution(4)
     */

    @Test
    public void testGameOfLife11(){
        int[][] board = {{0,0,0,0,0},
                         {0,0,0,0,0},
                         {0,1,1,1,0},
                         {0,0,0,0,0},
                         {0,0,0,0,0}};

        int[][] boardExpected = {{0,0,0,0,0},
                                 {0,0,0,0,0},
                                 {0,1,1,1,0},
                                 {0,0,0,0,0},
                                 {0,0,0,0,0}};

        GameOfLife sol = new GameOfLife(board);
        sol.evolution(4);
        assertEquals(boardExpected, sol.getBoard());
    }

    /*
     * GameOfLife Tests
     * Test case 12:
     * evolution(3)
     */

    @Test
    public void testGameOfLife12(){
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
        sol.evolution(3);
        assertEquals(boardExpected, sol.getBoard());
    }

    /*
     * GameOfLife Tests
     * Test case 13:
     * evolution(5)
     */

    @Test
    public void testGameOfLife13(){
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
        sol.evolution(5);
        assertEquals(boardExpected, sol.getBoard());
    }

    /*
     * GameOfLife Tests
     * Test case 14:
     * evolution(3)
     */

    @Test
    public void testGameOfLife14(){
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
                                 {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                                 {0,0,0,0,0,0,0,0,1,1,1,0,0,0,0,0,0,0,0},
                                 {0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0},
                                 {0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0},
                                 {0,0,0,0,0,0,0,0,1,1,1,0,0,0,0,0,0,0,0},
                                 {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                                 {0,0,0,0,0,0,0,0,1,1,1,0,0,0,0,0,0,0,0},
                                 {0,0,0,0,0,0,0,0,1,1,1,0,0,0,0,0,0,0,0},
                                 {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                                 {0,0,0,0,0,0,0,0,1,1,1,0,0,0,0,0,0,0,0},
                                 {0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0},
                                 {0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0},
                                 {0,0,0,0,0,0,0,0,1,1,1,0,0,0,0,0,0,0,0},
                                 {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                                 {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                                 {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                                 {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}
                                };

        GameOfLife sol = new GameOfLife(board);
        sol.evolution(3);
        assertEquals(boardExpected, sol.getBoard());
    }

    /*
     * GameOfLife Tests
     * Test case 15:
     * evolution(2)
     */

    @Test
    public void testGameOfLife15(){
        int[][] board = {{0,0,0,0,0,0},
                         {0,1,1,0,0,0},
                         {0,1,1,1,0,0},
                         {0,0,0,1,1,0},
                         {0,0,1,1,1,0},
                         {0,0,0,0,0,0}};

        int[][] boardExpected = {{0,0,0,0,0,0},
                                 {0,0,1,0,0,0},
                                 {1,1,0,0,0,0},
                                 {0,1,1,1,0,0},
                                 {0,0,1,1,0,0},
                                 {0,0,0,1,0,0}};

        GameOfLife sol = new GameOfLife(board);
        sol.evolution(2);
        assertEquals(boardExpected, sol.getBoard());
    }

    /*
     * TorusGameOfLife Tests
     * Test case 1:
     * neighbors(2,0)
     */

    @Test
    public void testTorusGameOfLife1(){
        int[][] board = {{0,0,0,0,0},
                         {0,0,0,0,0},
                         {1,1,0,0,1},
                         {0,0,0,0,0},
                         {0,0,0,0,0}};

        TorusGameOfLife sol = new TorusGameOfLife(board);
        assertEquals(2, sol.neighbors(2,0));
    }

    /*
     * TorusGameOfLife Tests
     * Test case 2:
     * neighbors(2,5)
     */

    @Test
    public void testTorusGameOfLife2(){
        int[][] board = {{0,0,0,0,0,0},
                         {0,0,0,0,0,0},
                         {0,0,0,1,1,1},
                         {1,1,1,0,0,0},
                         {0,0,0,0,0,0},
                         {0,0,0,0,0,0}};

        TorusGameOfLife sol = new TorusGameOfLife(board);
        assertEquals(2, sol.neighbors(2,5));
    }

    /*
     * TorusGameOfLife Tests
     * Test case 3:
     * neighbors(3,5)
     */

    @Test
    public void testTorusGameOfLife3(){
        int[][] board = {{0,0,0,0,0,0},
                         {1,1,0,0,0,0},
                         {1,1,0,0,0,0},
                         {0,0,0,0,1,1},
                         {0,0,0,0,1,1},
                         {0,0,0,0,0,0}};

        TorusGameOfLife sol = new TorusGameOfLife(board);
        assertEquals(4, sol.neighbors(3,5));
    }

    /*
     * TorusGameOfLife Tests
     * Test case 4:
     * neighbors(0,10)
     */

    @Test
    public void testTorusGameOfLife4(){
        int[][] board = {{0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0},
                         {0,0,0,0,0,0,0,0,1,1,1,0,0,0,0,0,0,0,0},
                         {0,0,0,0,0,0,0,1,0,1,0,1,0,0,0,0,0,0,0},
                         {0,0,0,0,0,0,0,1,0,1,0,1,0,0,0,0,0,0,0},
                         {0,0,0,0,0,0,0,0,1,1,1,0,0,0,0,0,0,0,0},
                         {0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0},
                         {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                         {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                         {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                         {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                         {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                         {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                         {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                         {0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0},
                         {0,0,0,0,0,0,0,0,1,1,1,0,0,0,0,0,0,0,0},
                         {0,0,0,0,0,0,0,1,0,1,0,1,0,0,0,0,0,0,0},
                         {0,0,0,0,0,0,0,1,0,1,0,1,0,0,0,0,0,0,0},
                         {0,0,0,0,0,0,0,0,1,1,1,0,0,0,0,0,0,0,0},
                         {0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0}
                         };

        TorusGameOfLife sol = new TorusGameOfLife(board);
        assertEquals(4, sol.neighbors(0,10));
    }

    /*
     * TorusGameOfLife Tests
     * Test case 5:
     * neighbors(2,0)
     */

    @Test
    public void testTorusGameOfLife5(){
        int[][] board = {{1,0,0,0,1},
                         {1,0,0,0,1},
                         {0,1,0,0,1},
                         {1,0,0,0,0},
                         {0,1,0,0,0}};

        TorusGameOfLife sol = new TorusGameOfLife(board);
        assertEquals(5, sol.neighbors(2,0));
    }

    /*
     * TorusGameOfLife Tests
     * Test case 6:
     * oneStep()
     */

    @Test
    public void testTorusGameOfLife6(){
        int[][] board = {{0,0,0,0,0},
                         {0,0,0,0,0},
                         {1,1,0,0,1},
                         {0,0,0,0,0},
                         {0,0,0,0,0}
                         };

        int[][] boardExpected = {{0,0,0,0,0},
                                 {1,0,0,0,0},
                                 {1,0,0,0,0},
                                 {1,0,0,0,0},
                                 {0,0,0,0,0}
                                };

        TorusGameOfLife sol = new TorusGameOfLife(board);
        sol.oneStep();
        assertEquals(boardExpected, sol.getBoard());
    }

    /*
     * TorusGameOfLife Tests
     * Test case 7:
     * oneStep()
     */

    @Test
    public void testTorusGameOfLife7(){
        int[][] board = {{0,0,0,0,0,0},
                         {0,0,0,0,0,0},
                         {0,0,0,1,1,1},
                         {1,1,1,0,0,0},
                         {0,0,0,0,0,0},
                         {0,0,0,0,0,0}
                        };

        int[][] boardExpected = {{0,0,0,0,0,0},
                                 {0,0,0,0,0,0},
                                 {0,0,0,1,1,1},
                                 {1,1,1,0,0,0},
                                 {0,0,0,0,0,0},
                                 {0,0,0,0,0,0}
                                };

        TorusGameOfLife sol = new TorusGameOfLife(board);
        sol.oneStep();
        assertEquals(boardExpected,board);
    }

    /*
     * TorusGameOfLife Tests
     * Test case 8:
     * oneStep()
     */
    @Test
    public void testTorusGameOfLife8(){
        int[][] board = {{0,0,0,0,0,0},
                         {1,1,0,0,0,0},
                         {1,1,0,0,0,0},
                         {0,0,0,0,1,1},
                         {0,0,0,0,1,1},
                         {0,0,0,0,0,0}
                         };

        int[][] expectedBoard = {{0,0,0,0,0,0},
                                 {1,1,0,0,0,0},
                                 {0,1,0,0,0,0},
                                 {0,0,0,0,1,0},
                                 {0,0,0,0,1,1},
                                 {0,0,0,0,0,0}
                                 };

        TorusGameOfLife sol = new TorusGameOfLife(board);
        sol.oneStep();
        assertEquals(expectedBoard, sol.getBoard());
    }

    /*
     * TorusGameOfLife Tests
     * Test case 9:
     * oneStep()
     */

    @Test
    public void testTorusGameOfLife9(){
        int[][] board = {{0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0},
                         {0,0,0,0,0,0,0,0,1,1,1,0,0,0,0,0,0,0,0},
                         {0,0,0,0,0,0,0,1,0,1,0,1,0,0,0,0,0,0,0},
                         {0,0,0,0,0,0,0,1,0,1,0,1,0,0,0,0,0,0,0},
                         {0,0,0,0,0,0,0,0,1,1,1,0,0,0,0,0,0,0,0},
                         {0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0},
                         {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                         {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                         {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                         {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                         {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                         {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                         {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                         {0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0},
                         {0,0,0,0,0,0,0,0,1,1,1,0,0,0,0,0,0,0,0},
                         {0,0,0,0,0,0,0,1,0,1,0,1,0,0,0,0,0,0,0},
                         {0,0,0,0,0,0,0,1,0,1,0,1,0,0,0,0,0,0,0},
                         {0,0,0,0,0,0,0,0,1,1,1,0,0,0,0,0,0,0,0},
                         {0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0}
                        };

        int[][] expectedBoard = {{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                                 {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                                 {0,0,0,0,0,0,0,1,0,0,0,1,0,0,0,0,0,0,0},
                                 {0,0,0,0,0,0,0,1,0,0,0,1,0,0,0,0,0,0,0},
                                 {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                                 {0,0,0,0,0,0,0,0,1,1,1,0,0,0,0,0,0,0,0},
                                 {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                                 {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                                 {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                                 {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                                 {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                                 {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                                 {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                                 {0,0,0,0,0,0,0,0,1,1,1,0,0,0,0,0,0,0,0},
                                 {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                                 {0,0,0,0,0,0,0,1,0,0,0,1,0,0,0,0,0,0,0},
                                 {0,0,0,0,0,0,0,1,0,0,0,1,0,0,0,0,0,0,0},
                                 {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                                 {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}
                                };

        TorusGameOfLife sol = new TorusGameOfLife(board);
        sol.oneStep();
    }

    /*
     * TorusGameOfLife Tests
     * Test case 10:
     * oneStep()
     */

    @Test
    public void testTorusGameOfLife10(){
        int[][] board = {{1,0,0,0,1},
                         {1,0,0,0,1},
                         {0,1,0,0,1},
                         {1,0,0,0,0},
                         {0,1,0,0,0}};

        int[][] expectedBoard = {{0,1,0,0,1},
                                 {0,1,0,1,0},
                                 {0,1,0,0,1},
                                 {1,1,0,0,0},
                                 {0,1,0,0,1}};

        TorusGameOfLife sol = new TorusGameOfLife(board);
        sol.oneStep();
        assertEquals(expectedBoard,sol.getBoard());
    }

    /*
     * TorusGameOfLife Tests
     * Test case 11:
     * evolution(3)
     */

    @Test
    public void testTorusGameOfLife11(){
        int[][] board = {{0,0,0,0,0},
                         {0,0,0,0,0},
                         {1,1,0,0,1},
                         {0,0,0,0,0},
                         {0,0,0,0,0}};

        int[][] boardExpected = {{0,0,0,0,0},
                                 {1,0,0,0,0},
                                 {1,0,0,0,0},
                                 {1,0,0,0,0},
                                 {0,0,0,0,0}
                                };

        TorusGameOfLife sol = new TorusGameOfLife(board);
        sol.evolution(3);
        assertEquals(boardExpected,sol.getBoard());
    }

    /*
     * TorusGameOfLife Tests
     * Test case 12:
     * evolution(3)
     */

    @Test
    public void testTorusGameOfLife12(){
        int[][] board = {{0,0,0,0,0,0},
                         {0,0,0,0,0,0},
                         {0,0,0,1,1,1},
                         {1,1,1,0,0,0},
                         {0,0,0,0,0,0},
                         {0,0,0,0,0,0}
                        };

        int[][] boardExpected = {{0,1,0,0,0,0},
                                 {0,1,0,0,0,0},
                                 {0,1,0,0,0,0},
                                 {0,0,0,0,1,0},
                                 {0,0,0,0,1,0},
                                 {0,0,0,0,1,0}
                                 };

        TorusGameOfLife sol = new TorusGameOfLife(board);
        sol.evolution(3);
        assertEquals(boardExpected,sol.getBoard());
    }

    /*
     * TorusGameOfLife Tests
     * Test case 13:
     * evolution(5)
     */

    @Test
    public void testTorusGameOfLife13(){
        int[][] board = {{0,0,0,0,0,0},
                         {1,1,1,0,0,0},
                         {1,1,0,0,0,0},
                         {0,0,0,1,1,1},
                         {0,0,0,0,1,1},
                         {0,0,0,0,0,0}
                        };

        int[][] expectedBoard = {{0,0,0,0,0,0},
                                 {0,0,0,0,0,0},
                                 {0,0,0,0,0,0},
                                 {0,0,0,0,0,0},
                                 {0,0,0,0,0,0},
                                 {0,0,0,0,0,0}
                                };

        TorusGameOfLife sol = new TorusGameOfLife(board);
        sol.evolution(5);
        assertEquals(expectedBoard, sol.getBoard());
    }

    /*
     * TorusGameOfLife Tests
     * Test case 14:
     * evolution(3)
     */

    @Test
    public void testTorusGameOfLife14(){
        int[][] board = {{0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0},
                         {0,0,0,0,0,0,0,0,1,1,1,0,0,0,0,0,0,0,0},
                         {0,0,0,0,0,0,0,1,0,1,0,1,0,0,0,0,0,0,0},
                         {0,0,0,0,0,0,0,1,0,1,0,1,0,0,0,0,0,0,0},
                         {0,0,0,0,0,0,0,0,1,1,1,0,0,0,0,0,0,0,0},
                         {0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0},
                         {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                         {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                         {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                         {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                         {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                         {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                         {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                         {0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0},
                         {0,0,0,0,0,0,0,0,1,1,1,0,0,0,0,0,0,0,0},
                         {0,0,0,0,0,0,0,1,0,1,0,1,0,0,0,0,0,0,0},
                         {0,0,0,0,0,0,0,1,0,1,0,1,0,0,0,0,0,0,0},
                         {0,0,0,0,0,0,0,0,1,1,1,0,0,0,0,0,0,0,0},
                         {0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0}
                        };

        int[][] expectedBoard = {{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                                 {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                                 {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                                 {0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0},
                                 {0,0,0,0,0,0,0,0,1,1,1,0,0,0,0,0,0,0,0},
                                 {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                                 {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                                 {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                                 {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                                 {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                                 {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                                 {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                                 {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                                 {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                                 {0,0,0,0,0,0,0,0,1,1,1,0,0,0,0,0,0,0,0},
                                 {0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0},
                                 {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                                 {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                                 {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}
                                };

        TorusGameOfLife sol = new TorusGameOfLife(board);
        sol.evolution(3);
        assertEquals(expectedBoard, sol.getBoard());
    }

    /*
     * TorusGameOfLife Tests
     * Test case 15:
     * evolution(4)
     */

    @Test
    public void testTorusGameOfLife15(){
        int[][] board = {{1,0,0,0,1},
                         {1,0,0,0,1},
                         {0,1,0,0,1},
                         {1,0,0,0,0},
                         {0,1,0,0,0}};

        int[][] expectedBoard = {{1,0,0,0,0},
                                 {0,1,1,0,0},
                                 {0,0,0,0,0},
                                 {0,0,0,1,1},
                                 {1,0,0,0,0}};

        TorusGameOfLife sol = new TorusGameOfLife(board);
        sol.evolution(4);
        assertEquals(expectedBoard,sol.getBoard());
    }
}
