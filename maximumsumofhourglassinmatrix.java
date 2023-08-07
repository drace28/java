import java.util.Scanner;

public class maximumsumofhourglassinmatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of rows: ");
        int n = sc.nextInt();
        System.out.println("Enter the no of columns: ");
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        if (n < 3 || m < 3) {
            System.out.println("The hourglass is not possible");
            System.exit(0);
        }
        System.out.println("Enter the elements of the matrix: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n - 2; i++) {
            for (int j = 0; j < n - 2; j++) {
                int sum = arr[i][j] + arr[i][j + 1] + arr[i][j + 2]
                        + arr[i + 1][j + 1] + arr[i + 2][j] + arr[i + 2][j + 1]
                        + arr[i + 2][j + 2];
                if (sum > max) {
                    max = sum;
                }

            }
        }
        System.out.println("The maximum sum of the hourglass in the matrix is: " + max);
        sc.close();
    }
}
