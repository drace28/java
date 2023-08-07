import java.util.Scanner;

public class Manuveringalgorithm {
    static int path(int[][] dp, int m, int n) {
        if (m == 1 || n == 1) {
            return 1;
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 1;
                } else {
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
                }
            }
        }

        return dp[m - 1][n - 1];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m, n;

        System.out.println("Number of rows: ");
        m = sc.nextInt();
        System.out.println("Number of columns: ");
        n = sc.nextInt();

        int[][] dp = new int[m][n];
        System.out.println("Devashish Jindal, 21BCE10029");
        System.out.println("Path Count: " + path(dp, m, n));
        sc.close();
    }
}
