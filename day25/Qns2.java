//Search A 2D Matrix
import java.util.*;

public class Qns2 {
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
        int searchedElement = sc.nextInt();
        searchA2DMatrix(arr, searchedElement);
    }

    private static void searchA2DMatrix(int[][] arr, int searchedElement) {
        int flag = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (searchedElement == arr[i][j]) {
                    flag = 1;
                }
            }
        }
        if (flag == 1) {
            System.out.print("Present");
        } else {
            System.out.print("Not-Present");
        }
    }
}