//Subarray with Sum Zero
import java.util.*;

public class Qns2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sizeOfArray = sc.nextInt();
        int[] arr = new int[sizeOfArray];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int resultantSumOfArray=0;
        subarrayWithSumZero(arr,resultantSumOfArray);
        
    }

    private static void subarrayWithSumZero(int[] arr, int resultantSumOfArray) {

        for (int start = 0; start < arr.length; start++) {
            for (int end = start + 1; end <= arr.length; end++) {
                int sum = 0;
                for (int i = start; i < end; i++)
                    sum += arr[i];
                if (sum == resultantSumOfArray){
                    System.out.print("Yes");
                }
            }
        }
    }
}
