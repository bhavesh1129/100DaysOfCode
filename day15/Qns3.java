//Max Element Using Recursion
import java.util.*;

public class Qns3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int numberOfElements=sc.nextInt();
        int[] arr=new int[numberOfElements];
        for(int i=0;i<numberOfElements;i++){
            arr[i]=sc.nextInt();
        }
        int maxElement=maxElementInArrayUsingRecursion(arr,0);
        System.out.print(maxElement);
    }

    private static int maxElementInArrayUsingRecursion(int[] arr,int numberOfElements){
        if(numberOfElements==arr.length-1){
            return arr[numberOfElements];
        }
        int maxInOtherArray=maxElementInArrayUsingRecursion(arr, numberOfElements+1);
        if(arr[0]>maxInOtherArray){
            return arr[0];
        }else{
            return maxInOtherArray;
        }
    }
}