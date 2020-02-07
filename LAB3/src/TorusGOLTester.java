public class TorusGOLTester {
    public static void main(String[] args) {
        int[][] board = {{0,1,0}, {1,1,1},{0,0,0}};
        GameOfLife play1 = new GameOfLife(board);

        play1.print();

        System.out.println();
        System.out.println("ONE STEP:");
        play1.oneStep();
        // System.out.println("count: " + play1.neighbors(1,1));

        play1.print();
    }


}
