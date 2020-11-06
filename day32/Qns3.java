import java.util.*;

public class Qns3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] price = new int[size];
        for (int i = 0; i < price.length; i++) {
            price[i] = sc.nextInt();
        }
        buyAndSellStockInfiniteTransactions(price);
    }

    private static void buyAndSellStockInfiniteTransactions(int[] price) {
        int buyDate = 0;
        int sellDate = 0;
        int profit = 0;
        for (int i = 1; i < price.length; i++) {
            if(price[i] >= price[i - 1]){
                sellDate++;
            }else{
                profit = price[sellDate] - price[buyDate];
                buyDate = sellDate = i;
            }
        }
        profit = price[sellDate] - price[buyDate];
        System.out.println(profit);
    }
}
