//Tiling With M * 1 Tiles
import java.util.*;

public class Qns5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int sizeOfM = sc.nextInt();
        tilingWithMCross1Tiles(number,sizeOfM);
    }

    private static void tilingWithMCross1Tiles(int number, int sizeOfM) {
        int[] dp = new int[number + 1];
        for (int i = 1; i <= number; i++) {
            if(i < sizeOfM){
                dp[i] = 1;
            }else if(i == sizeOfM){
                dp[i] = 2;
            }else{
                dp[i] = dp[i - 1] + dp[i - sizeOfM];
            }
        }
        System.out.print(dp[number]);
    }
}
