import java.util.*;

public class Qns2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int sizeOfArray = sc.nextInt();
        int[] arr = new int[sizeOfArray];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int resultantSum = sc.nextInt();
        targetSumSubsets(arr, 0, "", 0, resultantSum);
    }

    private static void targetSumSubsets(int[] arr, int index, String subsetArray, int sumSoFar, int resultantSum) {
        
        if(index == arr.length){
            if(sumSoFar == resultantSum){
                System.out.println(subsetArray + ".");
            }
            return;
        }
        targetSumSubsets(arr, index + 1, subsetArray + arr[index] + ",", sumSoFar + arr[index], resultantSum);
        targetSumSubsets(arr, index + 1, subsetArray, sumSoFar, resultantSum);
    }
}
