public class RatInAMaze {
   // https://practice.geeksforgeeks.org/problems/rat-in-a-maze-problem/1
   public static void main(String[] args) {
       int[][] maze = {{1, 0, 0,0},
                       {1, 1, 0, 1},
                       {1, 1, 0, 0},
                       {0, 1, 1, 1}};
       System.out.println(CountRatPath(maze, 0, 0));
   }

   public static int CountRatPath(int[][] maze, int i, int j) {
        if (i < 0 || j < 0 || i > maze.length - 1 || j > maze.length - 1 || maze[i][j] == 0) {
            return 0;
        }
        if (i == maze.length - 1 && j == maze.length - 1) {
            return 1;
        }
        maze[i][j] = 0;
        int PathsCount = CountRatPath(maze, i + 1, j) + CountRatPath(maze, i, j + 1) + CountRatPath(maze, i - 1, j) + CountRatPath(maze, i, j - 1);
        maze[i][j] = 1;
        return PathsCount;
    }
}
