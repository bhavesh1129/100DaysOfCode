//Sprial Traversal Of Matrix
import java.util.*;

public class Qns1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sizeOfRow = sc.nextInt();
        int sizeOfColumn = sc.nextInt();
        int[][] arr = new int[sizeOfRow][sizeOfColumn];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        sprialTraversalOfMatrix(arr, sizeOfRow, sizeOfColumn);
    }

    private static void sprialTraversalOfMatrix(int[][] arr, int sizeOfRow, int sizeOfColumn) {
        int minRow = 0;
        int minColumn = 0;
        int maxRow = arr.length;
        int maxColumn = arr[0].length;
        int count = 0;
        int totalElementsInMatrix = sizeOfRow * sizeOfColumn;

        while (count < totalElementsInMatrix) {
            // top side
            for (int i = minColumn, j = minRow; i < maxColumn; i++) {
                System.out.print(arr[j][i] + " ");
                count++;
            }
            minRow++;

            // down side
            for (int i = minRow, j = maxColumn - 1; i < maxRow; i++) {
                System.out.print(arr[i][j] + " ");
                count++;
            }
            maxColumn--;

            // bottom side
            for (int i = maxColumn - 1, j = maxRow - 1; i >= minColumn; i--) {
                System.out.print(arr[j][i] + " ");
                count++;
            }
            maxRow--;

            // left side
            for (int i = maxRow - 1, j = minColumn; i >= minRow; i--) {
                System.out.print(arr[i][j] + " ");
                count++;
            }
            minColumn++;
        }
    }
}