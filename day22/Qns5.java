//Trapping Rain Water
import java.util.*;

public class Qns5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sizeOfArray = sc.nextInt();
        int[] arr = new int[sizeOfArray];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        trappingRainWater(arr);
    }

    private static void trappingRainWater(int[] arr) {

        Arrays.sort(arr);
        int difference = 0;
        int secondMaximum = arr[arr.length - 2];
        if(arr[arr.length - 2] == arr[arr.length - 1]){
            secondMaximum = arr[arr.length - 3];
        }
        for (int i = 0; i < arr.length - 1; i++) {
            difference += secondMaximum - arr[i];
        }
        if(difference < 0){
            difference = 0;
        }
        System.out.print(difference);
    }
}