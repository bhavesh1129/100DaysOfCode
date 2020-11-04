//Min Cost In Maze Traversal
import java.util.*;

public class Qns5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sizeOfRow = sc.nextInt();
        int sizeOfColumn = sc.nextInt();
        int[][] arr = new int[sizeOfRow][sizeOfColumn];
        for (int i = 0; i < sizeOfRow; i++) {
            for (int j = 0; j < sizeOfColumn; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        minCostInMazeTraversal(arr, sizeOfRow, sizeOfColumn);
    }

    private static void minCostInMazeTraversal(int[][] arr, int sizeOfRow, int sizeOfColumn) {
        int[][] dp = new int[sizeOfRow][sizeOfColumn];
        for (int i = dp.length - 1; i >= 0; i--) {
            for (int j = dp[0].length - 1; j >= 0; j--) {
                if (i == dp.length - 1 && j == dp[0].length - 1) {
                    dp[i][j] = arr[i][j];
                } else if (i == dp.length - 1) {
                    dp[i][j] = dp[i][j + 1] + arr[i][j];
                } else if (j == dp[0].length - 1) {
                    dp[i][j] = dp[i + 1][j] + arr[i][j];
                } else {
                    dp[i][j] = Math.min(dp[i + 1][j], dp[i][j + 1]) + arr[i][j];
                }
            }
        }
        System.out.print(dp[0][0]);
    }
}
