import java.util.*;

public class Qns1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int[] value = new int[number];
        int[] weight = new int[number];
        for (int i = 0; i < value.length; i++) {
            value[i] = sc.nextInt();
        }
        for (int i = 0; i < weight.length; i++) {
            weight[i] = sc.nextInt();
        }
        int capacity = sc.nextInt();
        zeroOneKnapsack(number, value, weight, capacity);
    }

    private static void zeroOneKnapsack(int number, int[] value, int[] weight, int cap) {
        int[][] dp = new int[number + 1][cap + 1];
        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                if(j >= weight[i - 1]){
                    int remainingCap = j - weight[i - 1];
                    if(dp[i - 1][remainingCap] + value[i - 1] > dp[i - 1][j]){
                        dp[i][j] = dp[i - 1][remainingCap] + value[i - 1];
                    }else {
                        dp[i][j] = dp[i - 1][j];
                    }
                }else{
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        System.out.println(dp[number][cap]);
    }
}