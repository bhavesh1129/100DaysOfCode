//Print Maze Path
import java.util.Scanner;

public class Qns3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rowNumber = sc.nextInt();
        int colNumber = sc.nextInt();
        printMaze(1,1,rowNumber,colNumber,"");
    }

    private static void printMaze(int rowIndexNumber, int colIndexNumber, int rowNumber , int colNumber, String path) {
        if(rowIndexNumber > rowNumber || colIndexNumber > colNumber){
           return;
        }
        if(rowIndexNumber == rowNumber && colIndexNumber == colNumber){
           System.out.println(path);
           return;
        }
        printMaze(rowIndexNumber, colIndexNumber + 1, rowNumber, colNumber, path + "h");
        printMaze(rowIndexNumber + 1, colIndexNumber, rowNumber, colNumber, path + "v");
    }
}
