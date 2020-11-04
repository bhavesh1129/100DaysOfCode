//Climb Stairs with Minimum Moves
import java.util.Scanner;

public class Qns1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int[] arr = new int[number];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        climbStairsWithMinimumMoves(number, arr);
    }

    private static void climbStairsWithMinimumMoves(int number, int[] arr) {
        Integer[] dp = new Integer[number + 1];
        dp[number] = 0;
        for (int i = number - 1; i >= 0; i--) {
            if (arr[i] > 0) {
                int min = Integer.MAX_VALUE;

                for (int j = 1; j <= arr[i] && i + j < dp.length; j++) {
                    if (dp[i + j] != null) {
                        min = Math.min(min, dp[i + j]);
                    }
                }
                if (min != Integer.MAX_VALUE) {
                    dp[i] = min + 1;
                }
            }
        }
        System.out.println(dp[0]);
    }
}