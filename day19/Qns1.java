import java.util.*;

public class Qns1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sizeOfArray = sc.nextInt();
        int sumOfArray = sc.nextInt();
        int[] arr = new int[sizeOfArray];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        countPairWithGivenSum(arr,sumOfArray);
    }

    private static void countPairWithGivenSum(int[] arr, int sumOfArray) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[i]+arr[j] == sumOfArray){
                    count++;
                }
            }
        }
        System.out.print(count);
    }
}