//Print Stairs Path
import java.util.*;

public class Qns3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sizeOfString = sc.nextInt();
        printStairsPath(sizeOfString,"");
    }

    private static void printStairsPath(int sizeOfString, String path) {
        if(sizeOfString < 0){
            return;
        }
        if(sizeOfString == 0){
            System.out.println(path);
        }
        printStairsPath(sizeOfString - 1, path + "1");
        printStairsPath(sizeOfString - 2, path + "2");
        printStairsPath(sizeOfString - 3, path + "3");
    }
}
