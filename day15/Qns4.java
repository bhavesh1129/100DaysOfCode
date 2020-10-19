//First Index
import java.util.Scanner;

public class Qns4{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int numberOfElements=sc.nextInt();
        int[] arr=new int[numberOfElements];
        for (int i = 0; i < numberOfElements; i++) {
            arr[i]=sc.nextInt();
        }
        int searchedElement=sc.nextInt();
        int firstIndex=firstIndexOfTheElementInAnArray(arr,0,searchedElement);
        System.out.print(firstIndex);
    }

    private static int firstIndexOfTheElementInAnArray(int[] arr,int index, int searchedElement) {
        if(index==arr.length){
            return -1;
        }
        
        if(arr[index]==searchedElement){
            return index;
        }else{
            int firstIndexOfElement=firstIndexOfTheElementInAnArray(arr, index+1, searchedElement);
            return firstIndexOfElement;
        }
    }
}