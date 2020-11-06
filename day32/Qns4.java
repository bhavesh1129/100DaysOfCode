import java.util.*;

public class Qns4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] price = new int[size];
        for (int i = 0; i < price.length; i++) {
            price[i] = sc.nextInt();
        }
        int fees = sc.nextInt();
        buyAndSellStockWithTransactionFees(price, fees);
    }

    private static void buyAndSellStockWithTransactionFees(int[] price, int fees) {
        int oldBuyStateProfit = -price[0];
        int oldSellStateProfit = 0;
        for (int i = 0; i < price.length; i++) {
            int newBuyStateProfit = 0;
            int newSellStateProfit = 0;
            if (oldSellStateProfit - price[i] > oldBuyStateProfit) {
                newBuyStateProfit = oldSellStateProfit - price[i];
            } else {
                newBuyStateProfit = oldBuyStateProfit;
            }
            if (oldBuyStateProfit + price[i] - fees > oldSellStateProfit) {
                newSellStateProfit = oldBuyStateProfit + price[i] - fees;
            } else {
                newSellStateProfit = oldSellStateProfit;
            }
            oldBuyStateProfit = newBuyStateProfit;
            oldSellStateProfit = newSellStateProfit;
        }
        System.out.println(oldSellStateProfit);
    }
}
