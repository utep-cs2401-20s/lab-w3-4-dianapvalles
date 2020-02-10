public class TorusGameOfLife extends GameOfLife{

    public TorusGameOfLife(){
       super();
    }

    public TorusGameOfLife(int size){
        super(size);
    }

    public TorusGameOfLife(int[][] board){
        super(board);
    }

    /*
        0 0 0
        1 1 1
        0 0 0
     */
    @Override
    public int neighbors(int row, int col){
        int countAlive = 0;
        int prevRow = (row + size - 1) % size;
        int prevCol = (col + size - 1) % size;
        int nextRow = (row + size + 1) % size;
        int nextCol = (col + size + 1) % size;

        //Comments based on edges
        if(previousBoard[prevRow][prevCol] == 1){ //upper left diagonal
            countAlive++;
        }
        if(previousBoard[prevRow][nextCol] == 1){ //upper right diagonal
            countAlive++;
        }
        if(previousBoard[prevRow][col] == 1){ //looks for the one above
            countAlive++;
        }
        if(previousBoard[nextRow][col] == 1){ //looks for the one below
            countAlive++;
        }
        if(previousBoard[nextRow][prevCol] == 1){ //lower left diagonal
            countAlive++;
        }
        if(previousBoard[nextRow][nextCol] == 1){ //lower right diagonal
            countAlive++;
        }
        if(previousBoard[row][prevCol] == 1){ //looks for the one in the left
            countAlive++;
        }
        if(previousBoard[row][nextCol] == 1){ //looks for the one in the right
            countAlive++;
        }

        return countAlive;
    }
}
