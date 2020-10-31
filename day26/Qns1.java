//Sort Dates
import java.util.*;

public class Qns1 {

    public static void sortDates(String[] arr) {
        // For Days
        countSort(arr, 1000000, 100, 32);
        // For Months
        countSort(arr, 10000, 100, 13);
        // For Years
        countSort(arr, 1, 10000, 2501);
    }

    public static void countSort(String[] arr, int div, int mod, int range) {

        // Frequency Array
        int[] freqArr = new int[range];
        for (int i = 0; i < arr.length; i++) {
            String index = arr[i];
            freqArr[Integer.parseInt(index, 10) / div % mod]++;
        }
        // Prefix Sum Array
        for (int i = 1; i < freqArr.length; i++) {
            freqArr[i] += freqArr[i - 1];
        }
        // Filling Answer Array
        String[] ans = new String[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            String value = arr[i];
            int position = freqArr[Integer.parseInt(value, 10) / div % mod];
            int index = position - 1;
            ans[index] = value;
            freqArr[Integer.parseInt(value, 10) / div % mod]--;
        }
        for (int i = 0; i < ans.length; i++) {
            arr[i] = ans[i];
        }

    }

    public static void print(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            String str = scn.next();
            arr[i] = str;
        }
        sortDates(arr);
        print(arr);
    }

}