import java.util.Scanner;

public class Qns4 {
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
        mergeTwoSortedArray(arr1,arr2);
    }

    private static void mergeTwoSortedArray(int[] arr1, int[] arr2) {
        int count = 0;
        int[] newArray = new int[arr1.length + arr2.length];

        for (int i = 0; i < arr1.length; i++) {
            newArray[i] = arr1[i];
            count++;
        }
        for (int i = 0; i < arr2.length; i++) {
            newArray[count++] = arr2[i];
        }
        
        doSortingInResultedArray(newArray);
        printResultedArray(newArray);
    }

    private static void printResultedArray(int[] newArray) {
        for (int j = 0; j < newArray.length; j++) {
            System.out.print(newArray[j]+" ");
        }
    }

    private static void doSortingInResultedArray(int[] newArray) {
        //Insertation Sort
        for (int i = 1; i < newArray.length; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if(newArray[j] > newArray[j + 1]){
                    int temp = newArray[j];
                    newArray[j] = newArray[j + 1];
                    newArray[j + 1] = temp;
                }
            }
        }
    }
}
