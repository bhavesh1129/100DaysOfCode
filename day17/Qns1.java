//Get Stairs Path
import java.util.ArrayList;
import java.util.Scanner;

public class Qns1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int numberOfStairs=sc.nextInt();
        ArrayList<String> result=getStairsPath(numberOfStairs);
        System.out.print(result);
    }

    private static ArrayList<String> getStairsPath(int numberOfStairs) {
        if(numberOfStairs==0){
            ArrayList<String> baseCondition=new ArrayList<>();
            baseCondition.add("");
            return baseCondition;
        }else if(numberOfStairs<0){
            ArrayList<String> baseCondition=new ArrayList<>();
            return baseCondition;
        }
        ArrayList<String> firstPath=getStairsPath(numberOfStairs-1);
        ArrayList<String> secondPath=getStairsPath(numberOfStairs-2);
        ArrayList<String> thirdPath=getStairsPath(numberOfStairs-3);
        ArrayList<String> paths=new ArrayList<>();
        for (String path : firstPath) {
            paths.add(1+path);
        }
        for (String path : secondPath) {
            paths.add(2+path);
        }
        for (String path : thirdPath) {
            paths.add(3+path);
        }
        return paths;
    }
}