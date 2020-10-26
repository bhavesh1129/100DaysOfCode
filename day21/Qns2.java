//Median Of 2 Sorted Array Of Different Size
import java.util.*;

public class Qns2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sizeOfFirstArray = sc.nextInt();
        int[] arr1 = new int[sizeOfFirstArray];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }
        int sizeOfSecondArray = sc.nextInt();
        int[] arr2 = new int[sizeOfSecondArray];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }
        medianOf2SortedArrayOfDiffSize(arr1,arr2);
        
    }

    private static void medianOf2SortedArrayOfDiffSize(int[] arr1, int[] arr2) {
        int count = 0;
        int[] newArray = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            newArray[i] = arr1[i];
            count++;
        }
        for (int i = 0; i < arr2.length; i++) {
            newArray[count++] = arr2[i];
        }
        Arrays.sort(newArray);
        int indexOfmedianOfTwoSortedArray = newArray.length / 2;
        System.out.println(newArray[indexOfmedianOfTwoSortedArray]);
    }
}
