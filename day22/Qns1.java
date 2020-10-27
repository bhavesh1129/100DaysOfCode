//Flood Fill
import java.util.*;

public class Qns1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int sizeOfRow = sc.nextInt();
        int sizeOfCol = sc.nextInt();
        int[][] arr = new int[sizeOfRow][sizeOfCol];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        boolean[][] visitedArray = new boolean[sizeOfRow][sizeOfCol];
        floodFill(arr,0,0,"",visitedArray);
    }

    private static void floodFill(int[][] arr, int rowNumber, int colNumber, String path, boolean[][] visitedArray) {
        if(rowNumber < 0 || colNumber < 0 || rowNumber == arr.length || 
        colNumber == arr[0].length || arr[rowNumber][colNumber] == 1 || 
        visitedArray[rowNumber][colNumber] == true){
            return;
        }
        if(rowNumber == arr.length - 1 && colNumber == arr.length - 1){
            System.out.println(path);
            return;
        }

            visitedArray[rowNumber][colNumber] = true;
            floodFill(arr, rowNumber - 1, colNumber, path + "t", visitedArray);
            floodFill(arr, rowNumber, colNumber - 1, path + "l", visitedArray);
            floodFill(arr, rowNumber + 1, colNumber, path + "d", visitedArray);
            floodFill(arr, rowNumber, colNumber + 1, path + "r", visitedArray);
            visitedArray[rowNumber][colNumber] = false;
    }
}