/**
 * Non-GUI version.
 * 
 * @author Vaikan Peddi 
 * @version 1.0
 */

public class Life
{
    public static final int ROWS = 20;
    public static final int COLS = 80;
    public static final int TIME_DELAY=100;

    /**
     * The intializeBoard static method sets up the initial board with a 
     * random set of cells.
     * @param board a Board, typically empty
     */

    public static void initializeBoard(Board board) {
        for (int r = 0; r < ROWS; r++) {
            for (int c = 0; c < COLS; c++) {
                int randNum = (int)(Math.random() * 3);
                if (randNum == 0) {
                    board.set(r, c, 1);
                }
                else {
                    board.set(r, c, 0);
                }
            }
        }
    }

    /**
     * The static displayBoard method displays the board on screen. A Board
     * is a 2-dimensional int[][] array, so for the display to include other
     * characters--"." and "0", for example--characters will need to be printed
     * on the screen after checking the int value of that location.
     * @param board the board to be displayed
     */

    public static void displayBoard(Board board) {
        for (int r = 0; r < ROWS; r++) {
            for (int c = 0; c < COLS; c++) {
                if (board.get(r, c) == 1) {
                    System.out.print("0");
                }
                else {
                    System.out.print(".");
                }
            }
            System.out.println();
        }
    }

    /**
     * The static calculateNextGeneration method takes the current board and 
     * a new (empty) board and calculates the next generation for that second
     * board based on the standard rules of Conway's Life:
     * 1. existing cell dies if fewer than 2 neighbors (underpopulation)
     * 2. existing cell lives if 2-3 neighbors ("these neighbors are JUST RIGHT!")
     * 3. existing cell dies if greater than 3 neighbors (overpopulation)
     * 4. empty cell becomes alive if exactly 3 neighbors (because...?)
     * 
     * @param b the current board
     * @param nextB a board with the new generation on it
     */

    public static void calculateNextGeneration(Board b, Board nextB) {
        for (int r = 0; r < ROWS; r++) {
            for (int c = 0; c < COLS; c++) {
                int neighbors = countNeighbors(r, c, b);
                if (b.get(r, c) == 1 && neighbors < 2) {
                    nextB.set(r, c, 0);
                }
                else if (b.get(r, c) == 1 && neighbors < 4) {
                    nextB.set(r, c, 1);
                }
                else if (b.get(r, c) == 1 && neighbors > 3) {
                    nextB.set(r, c, 0);
                }
                else if (b.get(r, c) == 0 && neighbors == 3) {
                    nextB.set(r, c, 1);
                }
                else {
                    nextB.set(r, c, 0);
                }
            }
        }
    }

    /**
     * The static method countNeighbors counts the eight cells around a given 
     * cell, making sure not to count outside of the bounds of the array and 
     * not to count the current cell itself!
     * @param row the row of the current cell
     * @param col the col of the current cell
     * @param b the board we're investigating
     * @return the number of non-zero neighbors (minimum 0, maximum 8)
     */

    public static int countNeighbors(int r, int c, Board b) {
        int count = 0;
        for (int i = r - 1; i <= r + 1; i++) {
            for (int j = c - 1; j <= c + 1; j++) {
                if (i >= 0 && i < ROWS &&
                    j >= 0 && j < COLS &&
                    !(i == r && j == c) &&
                    b.get(i, j) == 1){
                        count++;
                    }
            }
        }
        return count;
    }
    
    /**
     * The static method transferNextToCurrent takes the board with the 
     * next generation and copies it to the board for this generation so 
     * that we can continue displaying and analyzing generations.
     * @param board the current board that we will copy to
     * @param nextBoard the next board containing a calculated new generation
     */
    
    public static void transferNextToCurrent(Board curr, Board next) {
        for (int i=0; i<ROWS; i++) {
            for (int j=0; j<COLS; j++) {
                curr.set(i, j, next.get(i, j));
            }
        }
    }

    /**
     * The clearConsole method attempts to clear the Terminal so that
     * successive generations of the board can be displayed
     */
    private static void clearConsole()
    {
        //System.out.print("\033[H\033[2J");  
        //System.out.flush(); 
        System.out.print('\u000C');
    }

    private static void slow(int TIME_DELAY)
    {
        // Sleep for some amount of time to slow display down
        try
        {
            Thread.sleep(TIME_DELAY);
            // TIME_DELAY is an integer in milliseconds
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
    }

    public static void main(String[] args)
    {
        Board b = new Board(ROWS, COLS);
        Board nB = new Board(ROWS, COLS);
        initializeBoard(b);
        
        for (int i = 0; i<1000; i++) {
            clearConsole();
            displayBoard(b);
            slow(TIME_DELAY);
            calculateNextGeneration(b, nB);
            transferNextToCurrent(b, nB);
        }
    }
}
