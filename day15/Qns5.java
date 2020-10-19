//Last Index
import java.util.*;

public class Qns5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int numberOfElements=sc.nextInt();
        int[] arr=new int[numberOfElements];
        for (int i = 0; i < numberOfElements; i++) {
            arr[i]=sc.nextInt();
        }
        int searchedElement=sc.nextInt();
        int lastIndex=lastIndexOfTheElementInAnArray(arr,0,searchedElement);
        System.out.print(lastIndex);
    }

    private static int lastIndexOfTheElementInAnArray(int[] arr, int index, int searchedElement) {
        if(index==arr.length){
            return -1;
        }
        int lastIndexOfElement=lastIndexOfTheElementInAnArray(arr, index+1, searchedElement);
        if(lastIndexOfElement==-1){
            if(arr[index]==searchedElement){
                return index;
            }else{
                return -1;
            }
        }else{
            return lastIndexOfElement;
        }
    }
}
