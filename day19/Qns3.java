//Best Time To Buy Or Sell Stocks
import java.util.*;

public class Qns3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sizeOfArray = sc.nextInt();
        int[] arr = new int[sizeOfArray];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        bestTimeToBuyOrSellStocks(arr);
    }

    private static void bestTimeToBuyOrSellStocks(int[] arr) {
        if(arr.length <= 2 || arr == null){
            return;
        }
        int minPrice = arr[0];
        int maxProfit = 0;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > arr[i-1]){
                maxProfit = Math.max(maxProfit, arr[i]-minPrice);
            }else{
                minPrice = Math.min(minPrice,arr[i]);
            }
        }
        System.out.print(maxProfit);
    }
}
