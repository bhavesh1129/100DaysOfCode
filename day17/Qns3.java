import java.util.*;

public class Qns3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int numberOfRows=sc.nextInt();
        int numberOfColumns=sc.nextInt();

        ArrayList<String> result=getMazePathWithJumps(1,1,numberOfColumns,numberOfRows);
        System.out.print(result);
    }

    private static ArrayList<String> getMazePathWithJumps(int currentRow, int currentCol, int finalRow, int finalCol) {
        if(currentRow==finalRow && currentCol==finalCol){
            ArrayList<String> baseCondition=new ArrayList<>();
            baseCondition.add("");
            return baseCondition;
        }

        ArrayList<String> paths=new ArrayList<>();
        for (int size = 1; size <= finalCol-currentCol; size++) {
            ArrayList<String> horizontalPath=getMazePathWithJumps(currentRow, currentCol+size, finalRow, finalCol);
            for (String horiPath : horizontalPath) {
                paths.add("h"+size+horiPath);
            }
        }
        for (int size = 1; size <= finalRow-currentRow; size++) {
            ArrayList<String> verticalPath=getMazePathWithJumps(currentRow+size, currentCol, finalRow, finalCol);
            for (String vertPath : verticalPath) {
                paths.add("v"+size+vertPath);
            }
        }
        for (int size = 1; size <= finalRow-currentRow && size <= finalCol-currentCol; size++) {
            ArrayList<String> directPath=getMazePathWithJumps(currentRow+size, currentCol+size, finalRow, finalCol);
            for (String dirPath : directPath) {
                paths.add("d"+size+dirPath);
            }
        }
        return paths;
    }
}
