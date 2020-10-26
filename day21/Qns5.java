//Number Of Operations To Make An Array Palindromic
import java.util.*;

public class Qns5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sizeOfArray = sc.nextInt();
        int[] arr = new int[sizeOfArray];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        numberOfOperationsToMakeAnArrayPalindromic(arr);
    }

    private static void numberOfOperationsToMakeAnArrayPalindromic(int[] arr) {
        int count = 0;

        for (int i = 0, j = arr.length - 1; i <= j;) {
            if(arr[i] == arr[j]){
                i++;
                j--;

            }else if(arr[i] < arr[j]){
                i++;
                arr[i] += arr[i - 1];
                count++;

            }else{
                j--;
                arr[j] += arr[j + 1];
                count++;
            }
        }
        System.out.print(count);
    }
}
