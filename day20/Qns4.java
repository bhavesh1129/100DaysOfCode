//Print Maze Path With Jumps
import java.util.*;

public class Qns4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rowNumber = sc.nextInt();
        int colNumber = sc.nextInt();
        printMazePathWithJumps(1,1,rowNumber,colNumber,"");
    }

    private static void printMazePathWithJumps(int rowIndexNumber, int colIndexNumber, int rowNumber , int colNumber, String path) {
        if(rowIndexNumber == rowNumber && colIndexNumber == colNumber){
            System.out.println(path);
            return;
        }
        for (int row = 1; row <= colNumber-colIndexNumber; row++) {
            printMazePathWithJumps(rowIndexNumber, colIndexNumber+row, rowNumber, colNumber, path+"h"+row);
        }
        for (int col = 1; col <= rowNumber-rowIndexNumber; col++) {
            printMazePathWithJumps(rowIndexNumber+col, colIndexNumber, rowNumber, colNumber, path+"v"+col);
        }
        for (int dia = 1; dia <= rowNumber-rowIndexNumber && dia <= colNumber-colIndexNumber; dia++) {
            printMazePathWithJumps(rowIndexNumber+dia, colIndexNumber+dia, rowNumber, colNumber, path+"d"+dia);
        }

    
    }
}
