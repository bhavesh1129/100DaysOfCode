//Climb Stairs With Variable Jumps
import java.util.*;

public class Qns5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sizeOfArray = sc.nextInt();
        int[] arr = new int[sizeOfArray];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        climbStairsWithJumps(sizeOfArray,arr);
    }

    private static void climbStairsWithJumps(int sizeOfArray, int[] arr) {
        int[] dp = new int[sizeOfArray + 1];
        dp[sizeOfArray] = 1;
        for (int i = sizeOfArray- 1; i >= 0; i--) {
            for (int j = 1; j <= arr[i] && i + j < dp.length; j++) {
                dp[i] += dp[i + j];
            }
        }
        System.out.println(dp[0]);
    }
}