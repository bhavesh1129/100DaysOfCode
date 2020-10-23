//Get Maize Path
import java.util.ArrayList;
import java.util.Scanner;

public class Qns2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int numberOfRows=sc.nextInt();
        int numberOfColumns=sc.nextInt();

        ArrayList<String> result=getMazePath(1,1,numberOfRows,numberOfColumns);
        System.out.print(result);
    }

    private static ArrayList<String> getMazePath(int currentRow, int currentCol, int finalRow, int finalCol) {
        if(currentRow==finalRow && currentCol==finalCol){
            ArrayList<String> baseCondition=new ArrayList<>();
            baseCondition.add("");
            return baseCondition;
        }

        ArrayList <String> horizontalPath=new ArrayList<>();
        ArrayList <String> verticalPath=new ArrayList<>();
        if(currentRow<finalRow){
            horizontalPath=getMazePath(currentRow+1, currentCol, finalRow, finalCol);
        }
        if(currentCol<finalCol){
            verticalPath=getMazePath(currentRow, currentCol+1, finalRow, finalCol);
        }
        ArrayList<String> paths=new ArrayList<>();

        for (String horiPath : horizontalPath) {
            paths.add("h"+horiPath);
        }
        for (String veriPath : verticalPath) {
            paths.add("v"+veriPath);
        }
        return paths;
    }
}

