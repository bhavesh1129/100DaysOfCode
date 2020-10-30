//Median In Row Wise Sorted Matrix
import java.util.*;

public class Qns3 {
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
        medianInRowWiseSortedMatrix(arr,sizeOfRow,sizeOfColumn);
    }

    private static void medianInRowWiseSortedMatrix(int[][] arr, int sizeOfRow, int sizeOfColumn) {
        sortingOf2DArray(arr,sizeOfRow,sizeOfColumn);
    }

    private static void sortingOf2DArray(int[][] arr, int sizeOfRow, int sizeOfColumn) {
        int[] newArray = new int[sizeOfRow * sizeOfColumn];
        int count = 0;

        for (int i = 0; i < sizeOfRow; i++) {
            for (int j = 0; j < sizeOfColumn; j++) {
                newArray[count] = arr[i][j];
                count++;
            }
        }
        Arrays.sort(newArray);
        int medianIndexOfNewArray = newArray.length / 2;
        int medianElementOfNewArray = newArray[medianIndexOfNewArray];
        System.out.print(medianElementOfNewArray);
    }
}
