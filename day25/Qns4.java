//Regix Sort
import java.util.*;

public class Qns4 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        radixSort(arr);
        print(arr);
    }

    public static void radixSort(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int val : arr) {
            if (max < val) {
                max = val;
            }
        }
        int exp = 1;
        while (exp <= max) {
            countSort(arr, exp);
            exp *= 10;
        }
    }

    public static void countSort(int[] arr, int exp) {

        int rangeOfArray = 10;
        int[] frequencyArray = new int[rangeOfArray];

        for (int i = 0; i < arr.length; i++) {
            int index = arr[i];
            frequencyArray[arr[i] / exp % 10]++;
        }

        for (int i = 1; i < frequencyArray.length; i++) {
            frequencyArray[i] = frequencyArray[i] + frequencyArray[i - 1];
        }

        int[] resultedSortedArray = new int[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {
            int value = arr[i];
            int position = frequencyArray[value / exp % 10];
            int index = position - 1;
            resultedSortedArray[index] = value;
            frequencyArray[arr[i] / exp % 10]--;
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = resultedSortedArray[i];
        }
        System.out.print("After sorting on " + exp + " place -> ");
        print(arr);
    }

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}