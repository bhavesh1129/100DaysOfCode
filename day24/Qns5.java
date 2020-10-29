//tripletSumOfArray 
import java.util.Scanner;

public class Qns5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sizeOfArray = sc.nextInt();
        int[] arr = new int[sizeOfArray];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int maxSum = sc.nextInt();
        tripletSumOfArray(arr, maxSum);
    }

    private static void tripletSumOfArray(int[] arr, int maxSum) {
        int flag = 0;
        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] == maxSum) {
                        flag = 1;
                    }
                }
            }
        }
        if (flag == 1) {
            System.out.print("1");
        } else {
            System.out.print("0");
        }
    }
}
