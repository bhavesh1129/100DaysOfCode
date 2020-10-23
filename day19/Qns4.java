//Count Inversion In An Array
import java.util.*;

public class Qns4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sizeOfArray = sc.nextInt();
        int[] arr = new int[sizeOfArray];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int result=countInversionInAnArray(arr);
        System.out.print(result);
    }

    private static int countInversionInAnArray(int[] arr) {
        int inverionCount=0;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[i]>arr[j]){
                    inverionCount++;
                }
            }
        }
        return inverionCount;
    }
}
