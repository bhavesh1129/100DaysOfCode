//Sorted 2D Matrix
import java.util.*;

public class Qns6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sizeOfMatrix = sc.nextInt();
        int[][] arr = new int[sizeOfMatrix][sizeOfMatrix];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        sorted2DMatrix(arr, sizeOfMatrix);
    }

    private static void sorted2DMatrix(int[][] arr, int sizeOfMatrix) {

        // Convert 2D Matrix in 1D Array
        int[] newArray = new int[sizeOfMatrix * sizeOfMatrix];
        int count = 0;
        for (int i = 0; i < sizeOfMatrix; i++) {
            for (int j = 0; j < sizeOfMatrix; j++) {
                newArray[count] = arr[i][j];
                count++;
            }
        }

        // Sort using Insertion Sort
        int temp;
        for (int i = 0; i < newArray.length; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (newArray[j] > newArray[j + 1]) {
                    temp = newArray[j];
                    newArray[j] = newArray[j + 1];
                    newArray[j + 1] = temp;
                }
            }
        }

        // Printing Matrix
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }
    }
}