//Coin Change Permutations
import java.util.*;

public class Qns4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sizeOfArray = sc.nextInt();
        int[] arr = new int[sizeOfArray];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int targetSum = sc.nextInt();
        coinChangePermutations(arr, targetSum);
    }

    private static void coinChangePermutations(int[] arr, int targetSum) {
        int[] dp = new int[targetSum + 1];
        dp[0] = 1;
        for (int i = 1; i <= targetSum; i++) {
            for (int coins : arr) {
                if(coins <= i){
                    int remainingAmount = i - coins;
                    dp[i] += dp[remainingAmount];
                }
            }
        }
        System.out.print(dp[targetSum]);
    }
}
