//Find Longest Repeating SubSequence
import java.util.*;

public class Qns2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        findLongestRepeatingSubSeq(str);
    }

    private static void findLongestRepeatingSubSeq(String str) {
        int sizeOfString = str.length();
        int[][] dp = new int[sizeOfString + 1][sizeOfString + 1];
        for (int i = 1; i <= sizeOfString; i++) {
            for (int j = 1; j <= sizeOfString; j++) {
                if (str.charAt(i - 1) == str.charAt(j - 1) && i != j) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i][j - 1], dp[i - 1][j]);
                }
            }
        }
        System.out.println(dp[sizeOfString][sizeOfString]);
    }
}
