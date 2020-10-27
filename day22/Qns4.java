//Knights Tour
import java.util.*;

public class Qns4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int sizeOfRow = sc.nextInt();
        int sizeOfCol = sc.nextInt();
        int[][] arr = new int[number][number];
        knightsTour(arr,sizeOfRow,sizeOfCol,1);
    }

    private static void knightsTour(int[][] chess, int sizeOfRow, int sizeOfCol, int move) {
       
        if(sizeOfRow < 0 || sizeOfCol < 0 || sizeOfRow >= chess.length 
        || sizeOfCol >= chess.length|| chess[sizeOfRow][sizeOfCol] != 0){
            return;
        }else if(move == chess.length * chess.length){
            chess[sizeOfRow][sizeOfCol] = move;
            displayBoard(chess);
            chess[sizeOfRow][sizeOfCol] = 0;
            return;
        }

        chess[sizeOfRow][sizeOfCol] = move;
        knightsTour(chess, sizeOfRow - 2, sizeOfCol + 1, move + 1);
        knightsTour(chess, sizeOfRow - 1, sizeOfCol + 2, move + 1);
        knightsTour(chess, sizeOfRow + 1, sizeOfCol + 2, move + 1);
        knightsTour(chess, sizeOfRow + 2, sizeOfCol + 1, move + 1);
        knightsTour(chess, sizeOfRow + 2, sizeOfCol - 1, move + 1);
        knightsTour(chess, sizeOfRow + 1, sizeOfCol - 2, move + 1);
        knightsTour(chess, sizeOfRow - 1, sizeOfCol - 2, move + 1);
        knightsTour(chess, sizeOfRow - 2, sizeOfCol - 1, move + 1);
        chess[sizeOfRow][sizeOfCol] = 0;
    }
    public static void displayBoard(int[][] chess){
        for(int i = 0; i < chess.length; i++){
            for(int j = 0; j < chess[0].length; j++){
                System.out.print(chess[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
