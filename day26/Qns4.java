//Sort 01
import java.util.*;

public class Qns4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        sort01(arr);
        print(arr);
    }

    public static void sort01(int[] arr) {
        int firstIndex = 0;
        int secondIndex = 0;

        while (firstIndex < arr.length) {
            if (arr[firstIndex] == 1) {
                firstIndex++;
            } else {
                swap(arr, firstIndex, secondIndex);
                firstIndex++;
                secondIndex++;
            }
        }

    }

    // used for swapping ith and jth elements of array
    public static void swap(int[] arr, int i, int j) {
        System.out.println("Swapping index " + i + " and index " + j);
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}