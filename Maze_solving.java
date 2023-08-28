import java.util.Scanner;
public class Maze_solving {

    public static boolean solveMaze(int[][] maze, int startRow, int startColumn, int[][] sol, int n, int m) {
        if (startRow == n - 1 && startColumn == m - 1) {
            sol[startRow][startColumn] = 1;
            return true;
        }

        if (maze[startRow][startColumn] == 1) {
            sol[startRow][startColumn] = 1;

            if (startRow + 1 < n && solveMaze(maze, startRow + 1, startColumn, sol, n, m)) {

                return true;
            } else if (solveMaze(maze, startRow, startColumn + 1, sol, n, m)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of rows of the maze");
        int n = sc.nextInt();
        System.out.println("Enter the no. of columns of the maze");
        int m = sc.nextInt();
        int[][] maze = new int[n][m];
        System.out.println("Enter the maze");
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the " + (i + 1) + " row");
            for (int j = 0; j < m; j++) {
                maze[i][j] = sc.nextInt();
            }
            sc.close();
        }
        int[][] sol = new int[n][m];
        if (solveMaze(maze, 0, 0, sol, n, m)) {
            System.out.println("Solution exists");
            System.out.println("The solution is");
            for (int i = 0; i < n; i++) {
                System.out.println("The " + (i + 1) + " row");
                for (int j = 0; j < m; j++) {
                    System.out.print(sol[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("No solution");
        }

    }

}
