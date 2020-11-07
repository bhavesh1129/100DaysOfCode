//Tiling With 2 * 1 Tiles
import java.util.*;

public class Qns4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        tilingWith2Cross1Tiles(number);
    }

    private static void tilingWith2Cross1Tiles(int number) {
        int[] dp = new int[number + 1];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= number; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        System.out.print(dp[number]);
    }
}
