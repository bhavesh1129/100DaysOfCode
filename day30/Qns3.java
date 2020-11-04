//Coin Change Combination
import java.util.Scanner;

public class Qns3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sizeOfArray = sc.nextInt();
        int[] arr = new int[sizeOfArray];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int targetSum = sc.nextInt();
        coinChangeCombination(arr,targetSum);
    }

    private static void coinChangeCombination(int[] arr, int targetSum) {
        int[] dp = new int[targetSum + 1];
        dp[0] = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = arr[i]; j < dp.length; j++) {
                dp[j] += dp[j - arr[i]];
            }
        }
        System.out.print(dp[targetSum]);
    }
}
