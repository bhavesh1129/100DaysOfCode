//N Queens
import java.util.*;

public class Qns3 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int sizeOfArray = sc.nextInt();
        int[][] arr = new int[sizeOfArray][sizeOfArray];
        nQueens(arr,"",0);
    }

    private static void nQueens(int[][] chess, String path, int row) {
        if(row == chess.length){
            System.out.println(path + ".");
            return;
        }
        for (int col = 0; col < chess.length; col++) {
            if(isItSafeToPlaceQueenHer(chess,row,col) == true){
                chess[row][col] = 1;
                nQueens(chess, path + row + "-" + col + ", ", row + 1);
                chess[row][col] = 0;
            }
        }
    }

    private static boolean isItSafeToPlaceQueenHer(int[][] chess, int row, int col) {
        for (int i = row - 1, j = col; i >= 0; i--) {
            if(chess[i][j] == 1){
                return false;
            }
        }
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i-- , j--) {
            if(chess[i][j] == 1){
                return false;
            }
        }
        for (int i = row - 1, j = col + 1; i >= 0 && j < chess.length; i-- , j++) {
            if(chess[i][j] == 1){
                return false;
            }
        }
        return true;
    }
}
