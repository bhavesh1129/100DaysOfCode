//Longest Consecutive Subarray
import java.util.*;

public class Qns1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sizeOfArray = sc.nextInt();
        int[] arr =new int[sizeOfArray];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        longestConsecutiveSubarray(arr);
    }

    private static void longestConsecutiveSubarray(int[] arr) {
        int count = 1;
        int result = 0;
        Arrays.sort(arr);
        for (int i = 1; i < arr.length; i++) {
                if(arr[i - 1] + 1 == arr[i]){
                    count++;
                }else{
                    count = 1;
                }
                result = Math.max(result, count);
            }
        System.out.print(result);
    }
}