//Rotate Matrix By 90 Degree
import java.util.*;
public class Qns2 {
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
        rotateMatrixBy90Degrees(arr,sizeOfRow,sizeOfColumn);
    }

    private static void rotateMatrixBy90Degrees(int[][] arr, int sizeOfRow, int sizeOfColumn) {
        for (int i = 0; i < sizeOfColumn; i++) {
            for (int j = sizeOfRow - 1; j >= 0; j--) {
                System.out.print(arr[j][i]+" ");
            }
            System.out.println();
        }
    }
}
