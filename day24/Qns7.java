//Array Subset With Another Subarray 
import java.util.*;

public class Qns7{
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
        arraySubsetWithAnotherSubarray(arr1,arr2);
    }

    private static void arraySubsetWithAnotherSubarray(int[] arr1, int[] arr2) {
        if(arr1.length > arr2.length){
            int count = 0;
            for (int i = 0; i < arr1.length; i++) {
                for (int j = 0; j < arr2.length; j++) {
                    if(arr1[i] == arr2[j]){
                        count++;
                    }
                }
            }
            if(count == arr2.length){
                System.out.print("Yes");
            }else{
                System.out.print("No");
            }
        }else if(arr1.length < arr2.length){
            int count = 0;
            for (int i = 0; i < arr1.length; i++) {
                for (int j = 0; j < arr2.length; j++) {
                    if(arr1[i] == arr2[j]){
                        count++;
                    }
                }
            }
            if(count == arr1.length){
                System.out.print("Yes");
            }else{
                System.out.print("No");
            }
        }
    }
}
