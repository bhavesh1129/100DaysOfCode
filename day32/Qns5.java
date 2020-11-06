//Buy And Sell Stock With Two Transaction
import java.util.*;

public class Qns5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] price = new int[size];
        for (int i = 0; i < price.length; i++) {
            price[i] = sc.nextInt();
        }
        buyAndSellStockWithTwoTransaction(price);
    }

    private static void buyAndSellStockWithTwoTransaction(int[] price) {
        int oldBuyStateProfit = -price[0];
        int oldSellStateProfit = 0;
        int oldCoolStateProfit = 0;

        for (int i = 0; i < price.length; i++) {
            int newBuyStateProfit = 0;
            int newSellStateProfit = 0;
            int newCoolStateProfit = 0;
            if(oldCoolStateProfit - price[i] > oldBuyStateProfit){
                newBuyStateProfit = oldCoolStateProfit - price[i];
            }else{
                newBuyStateProfit = oldBuyStateProfit;
            }
            if(oldBuyStateProfit + price[i] > oldSellStateProfit){
                newSellStateProfit = oldBuyStateProfit + price[i];
            }else{
                newSellStateProfit = oldSellStateProfit;
            }
            if(oldSellStateProfit > oldCoolStateProfit){
                newCoolStateProfit = oldSellStateProfit;
            }else{
                newCoolStateProfit = oldCoolStateProfit;
            }
            oldBuyStateProfit = newBuyStateProfit;
            oldCoolStateProfit = newCoolStateProfit;
            oldSellStateProfit = newSellStateProfit;
        }
        System.out.println(oldSellStateProfit);
    }
}
