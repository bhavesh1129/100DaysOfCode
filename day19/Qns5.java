//Find Common Elements In Sorted Array
import java.util.*;

public class Qns5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sizeOfArray1 = sc.nextInt();
        int[] arr1 = new int[sizeOfArray1];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }
        int sizeOfArray2 = sc.nextInt();
        int[] arr2 = new int[sizeOfArray2];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }
        int sizeOfArray3 = sc.nextInt();
        int[] arr3 = new int[sizeOfArray3];
        for (int i = 0; i < arr3.length; i++) {
            arr3[i] = sc.nextInt();
        }
        findCommonElementsInSortedArray(arr1,arr2,arr3);
    }

    private static void findCommonElementsInSortedArray(int[] arr1, int[] arr2, int[] arr3) {
        
        int indexOfArr1 = 0;
        int indexOfArr2 = 0;
        int indexOfArr3 = 0;

        while(indexOfArr1 < arr1.length && indexOfArr2 < arr2.length &&indexOfArr3 < arr3.length){
            if(arr1[indexOfArr1] == arr2[indexOfArr2] && arr2[indexOfArr2] == arr3[indexOfArr3]){
                System.out.print(arr1[indexOfArr1]+" ");
                indexOfArr1++;
                indexOfArr2++;
                indexOfArr3++;
            }else if(arr1[indexOfArr1]<arr2[indexOfArr2]){
                indexOfArr1++;
            }else if(arr2[indexOfArr2]<arr3[indexOfArr3]){
                indexOfArr2++;
            }else{
                indexOfArr3++;
            }
        }
    }
}
