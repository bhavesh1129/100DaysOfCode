//Maximum Product Subarray
import java.util.*;

public class Qns2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sizeOfArray = sc.nextInt();
        int[] arr = new int[sizeOfArray];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        maximumProductSubarray(arr);
    }

    private static void maximumProductSubarray(int[] arr) {
        int result = arr[0];
        int positive = 1;
        int negative = 1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > 0){
                positive = Math.max(positive * arr[i], arr[i]);
                negative = negative * arr[i];
            }else{
                int temp = negative;
                negative = Math.min(positive * arr[i], arr[i]);
                positive = temp * arr[i];
            }
            result = Math.max(result, positive);
            result = Math.max(result, negative);
        }
        System.out.print(result);
    }
}