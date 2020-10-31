//kth Smallest Element In A Matrix
import java.util.*;

public class Qns3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sizeOfRow = sc.nextInt();
        int sizeOfColumn = sc.nextInt();
        int[][] arr = new int[sizeOfRow][sizeOfColumn];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int k = sc.nextInt();
        kthSmallestElementInAMatrix(arr, sizeOfRow, sizeOfColumn, k);
    }

    private static void kthSmallestElementInAMatrix(int[][] arr, int sizeOfRow, int sizeOfColumn, int k) {
        //Convert 2D Matrix into 1D Array
        int[] newArray = new int[sizeOfRow * sizeOfColumn];
        int count = 0;
        for (int i = 0; i < sizeOfRow; i++) {
            for (int j = 0; j < sizeOfColumn; j++) {
                newArray[count] = arr[i][j];
                count++;
            }
        }
        // Sort the Array
        Arrays.sort(newArray);
        
        int kthSmallestIndex = k - 1;
        int kthSmallestElement = newArray[kthSmallestIndex];
        System.out.print(kthSmallestElement);
    }
}
