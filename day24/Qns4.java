//Count Sort
import java.util.*;

public class Qns4 {

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
            max = Math.max(max, arr[i]);
            min = Math.min(min, arr[i]);
        }
        countSort(arr, min, max);
        print(arr);
    }

    public static void countSort(int[] arr, int min, int max) {

        int range = max - min + 1;
        int[] frequencyArray = new int[range];

        for (int i = 0; i < arr.length; i++) {
            int index = arr[i] - min;
            frequencyArray[index]++;
        }
        for (int i = 1; i < frequencyArray.length; i++) {
            frequencyArray[i] += frequencyArray[i - 1];
        }
        int[] resultedSortedArray = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            int value = arr[i];
            int position = frequencyArray[value - min];
            int index = position - 1;
            resultedSortedArray[index] = value;
            frequencyArray[value - min]--;
        }
        for (int i = 0; i < resultedSortedArray.length; i++) {
            arr[i] = resultedSortedArray[i];
        }
    }

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}