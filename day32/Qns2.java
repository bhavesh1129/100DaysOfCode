//Buy And Sell Stocks
import java.util.*;

public class Qns2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] price = new int[size];
        for (int i = 0; i < price.length; i++) {
            price[i] = sc.nextInt();
        }
        buyAndSellStock(price);
    }

    private static void buyAndSellStock(int[] price) {
        int leastProfitSoFar = Integer.MAX_VALUE;
        int maxProfit = 0;
        int maxProfitIfSellToday = 0;
        for (int i = 0; i < price.length; i++) {
            if (price[i] < leastProfitSoFar) {
                leastProfitSoFar = price[i];
            }
            maxProfitIfSellToday = price[i] - leastProfitSoFar;
            if(maxProfitIfSellToday > maxProfit){
                maxProfit = maxProfitIfSellToday;
            }
        }
        System.out.println(maxProfit);
    }
}
