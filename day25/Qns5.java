//Row with Max Numbers 1's
import java.util.*;

public class Qns5 {
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
        rowWithMax1(arr);
    }

    private static void rowWithMax1(int[][] arr) {
        int maxOne = 0;//Suppose max number of 1's is 0
        int maxRowIndex = 0;//Suppose max 1's is in 1 row is 0

        for (int i = 0; i < arr.length; i++) {
            int countNumberOfOne = 0;
            for (int j = 0; j < arr[0].length; j++) {
                if(arr[i][j] == 1){
                    countNumberOfOne++;
                }
            }
            if(countNumberOfOne > maxOne){
                maxRowIndex = i;
                maxOne = countNumberOfOne;
            }
        }
        System.out.print(maxRowIndex);
    }
}
