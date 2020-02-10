public class GameOfLife {
    int size;
    int[][] board;
    int[][] previousBoard;

    public GameOfLife(){
        this(0);
    }

    public GameOfLife(int size){
        this.size = size;
        board = new int[size][size];
        previousBoard = new int[size][size];
    }

    public GameOfLife(int[][] board){
        this.size = board.length;

        this.board = new int[size][size];
        previousBoard = new int[size][size];

        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++){
                this.board [i][j] = board[i][j];
                this.previousBoard[i][j] = board[i][j];
            }
        }
    }

    public void setBoard(int[][] board){
        this.board = board;
    }

    public int[][] getBoard() {
        return board;
    }

    public void setPreviousBoard(int[][] previousBoard){
        this.previousBoard = previousBoard;
    }

    public int[][] getPreviousBoard(){
        return this.previousBoard;
    }

    public void oneStep(){
        //Sets the previous board to the current board
        for(int i = 0; i < this.board.length; i++){
            for(int j = 0; j < this.board[i].length; j++){
                previousBoard[i][j] = this.board[i][j];
            }
        }

        for(int i = 0; i < this.board.length; i++){
            for(int j = 0; j < this.board[i].length; j++){
                int alive = neighbors(i,j);

                if(previousBoard[i][j] == 1 && (alive > 3 || alive < 2)){
                    this.board[i][j] = 0;
                }
                else if(previousBoard[i][j] == 1 && (alive == 3 || alive ==2)){
                    this.board[i][j] = 1;
                }
                else if(previousBoard[i][j] == 0 && (alive == 3)){
                    this.board[i][j] = 1;
                }
            }
        }
    }

    /*
        neighbors method:
        computes the number of neighbors the corresponding cell in the board has
    */

    public int neighbors(int row, int col){
        int countAlive = 0;

        if(col+1 < board.length && previousBoard[row][col+1] == 1){ //looks for the one in the right
            countAlive++;
        }

        if(row+1 < board.length && previousBoard[row+1][col] == 1){ //looks for the one below
            countAlive++;
        }

        if(col-1 >= 0 && col > 0 && previousBoard[row][col-1] == 1){ //looks for the one on the left
            countAlive++;
        }

        if(row-1 >= 0 && previousBoard[row-1][col] == 1){ //looks for the one above
            countAlive++;
        }

        if(row-1 >= 0 && col + 1 < board.length && previousBoard[row-1][col+1] == 1){  //looks for the one in upper right diagonal
            countAlive++;
        }

        if(row+1 < board.length && col+1 < board.length && previousBoard[row+1][col+1] == 1){ //looks for the one in lower right diagonal
            countAlive++;
        }

        if(row+1 < board.length && col-1 >= 0 && previousBoard[row+1][col-1] == 1){ //looks for the one in lower left diagonal
            countAlive++;
        }

        if(row-1 >= 0 && col-1 >=0 && previousBoard[row-1][col-1] ==1){ //looks for the one in upper left diagonal
            countAlive++;
        }

        return countAlive;
    }

    /*
        Evolution method:
        Transforms the board n times (successive calls to oneStep)
     */
    public void evolution(int n){
        while(n >  0){
            oneStep();
            n--;
        }
    }

    public void print(){
        System.out.println("PREVIOUS");
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++){
                System.out.print(previousBoard[i][j]);
            }
            System.out.println("");
        }

        System.out.println("");

        System.out.println("CURRENT");
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++){
                System.out.print(board[i][j]);
            }
            System.out.println("");
        }
    }
}
