import java.util.*;

public class Qns2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        targetSumSubsets(arr, target);
    }

    private static void targetSumSubsets(int[] arr, int target) {
        boolean[][] dp = new boolean[arr.length + 1][target + 1];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                if (i == 0 && j == 0) {
                    dp[i][j] = true;
                } else if (i == 0) {
                    dp[i][j] = false;
                } else if (j == 0) {
                    dp[i][j] = true;
                } else {
                    if (dp[i - 1][j] == true) {
                        dp[i][j] = true;
                    } else {
                        int value = arr[i - 1];
                        if (j >= value) {
                            if (dp[i - 1][j - value] == true) {
                                dp[i][j] = true;
                            }
                        }
                    }
                }
            }
        }
        System.out.print(dp[arr.length][target]);
    }
}
