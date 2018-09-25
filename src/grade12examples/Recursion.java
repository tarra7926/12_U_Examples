package grade12examples;

/**
 *
 * @author tarra7926
 */
public class Recursion {

    public int fib(int n) {
        //base case
        if (n == 1 || n == 0) {
            return 1;
        }
        //recursive call
        return fib(n - 1) + fib(n - 2);
    }

    public void solveMaze(int[][] maze, int startX, int startY, int finX, int finY) {
        //if this is a spot we have already been at go back
        if(maze[startX][startY] == 2){
            return;
        }
        //if this is a wall go back
        if(maze[startX][startY] == 1){
            return;
        }
        //mark our spot
        maze[startX][startY] = 2;
        //base case
        if (startX == finX && startY == finY) {
            //print solution
            for (int i = 0; i < maze[0].length; i++) {
                for (int j = 0; j < maze.length; j++) {
                    System.out.print(maze[j][i]);
                }
                System.out.println();
            }
        }
        //recursive call section
        int up = startY - 1;
        int down = startY + 1;
        int right = startX + 1;
        int left = startX - 1;

        // make sure they are valid before calling
        if (up >= 0 && up < maze[startX].length) {
            solveMaze(maze, startX, up, finX, finY);
        }
        // make sure they are valid before calling
        if (right >= 0 && right < maze.length) {
            solveMaze(maze, right, startY, finX, finY);
        }
        // make sure they are valid before calling
        if (left >= 0 && left < maze.length) {
            solveMaze(maze, left, startY, finX, finY);
        }
        // make sure they are valid before calling
        if (down >= 0 && down < maze[startX].length) {
            solveMaze(maze, startX, down, finX, finY);
        }
        //exhausted all possible spots
        //undo movement
        maze[startX][startY] = 0;
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //a variable to test the method
        Recursion test = new Recursion();

        int n = test.fib(4);
        System.out.println("Fib 4 == " + n);
        System.out.println("Solution found");
        
        int[][] maze1 = new int[6][6];
        maze1[0][0] = 1;
        maze1[1][0] = 1;
        maze1[2][0] = 1;
        maze1[3][0] = 1;
        maze1[4][0] = 1;
        maze1[5][0] = 1;
       
        maze1[0][1] = 0;
        maze1[1][1] = 0;
        maze1[2][1] = 0;
        maze1[3][1] = 0;
        maze1[4][1] = 0;
        maze1[5][1] = 1;
        
        maze1[0][2] = 1;
        maze1[1][2] = 0;
        maze1[2][2] = 1;
        maze1[3][2] = 1;
        maze1[4][2] = 1;
        maze1[5][2] = 1;
        
        maze1[0][3] = 1;
        maze1[1][3] = 0;
        maze1[2][3] = 1;
        maze1[3][3] = 0;
        maze1[4][3] = 0;
        maze1[5][3] = 0;
        
        maze1[0][4] = 1;
        maze1[1][4] = 0;
        maze1[2][4] = 0;
        maze1[3][4] = 0;
        maze1[4][4] = 1;
        maze1[5][4] = 1;
       
        maze1[0][5] = 1;
        maze1[1][5] = 1;
        maze1[2][5] = 1;
        maze1[3][5] = 1;
        maze1[4][5] = 1;
        maze1[5][5] = 1;
        
        test.solveMaze(maze1, 0, 1, 5, 3);
        
    }
}
