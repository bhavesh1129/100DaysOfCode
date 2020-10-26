//Three Way Partitioning
import java.util.*;

public class Qns3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sizeOfArray = sc.nextInt();
        int[] arr = new int[sizeOfArray];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int valueAtFirstIndex = sc.nextInt();
        int valueOfLastIndex = sc.nextInt();

        threeWayPartitioning(arr,valueAtFirstIndex,valueOfLastIndex);
    }

    private static void threeWayPartitioning(int[] arr, int valueAtFirstIndex, int valueOfLastIndex) {

        int startPosition = 0;
        int endPoition = arr.length - 1;

        for (int i = 0; i < endPoition;) {
            if(arr[i] < valueAtFirstIndex){
                int temp = arr[startPosition];
                arr[startPosition] = arr[i];
                arr[i] = temp;
                startPosition++;
                i++;
            }else if(arr[i] > valueOfLastIndex){
                int temp = arr[endPoition];
                arr[endPoition] = arr[i];
                arr[i] = temp;
                endPoition--;
            }else{
                i++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
