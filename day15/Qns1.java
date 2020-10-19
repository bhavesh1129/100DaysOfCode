import java.util.*;

public class Qns1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int numberOfElements=sc.nextInt();
        int[] arr=new int[numberOfElements];
        for(int i=0;i<numberOfElements;i++){
            arr[i]=sc.nextInt();
        }
        displayArrayUsingRecursion(arr,numberOfElements-1);
    }

    private static void displayArrayUsingRecursion(int[] arr,int numberOfElements) {
        if(numberOfElements<0){
            return;
        }
        
        displayArrayUsingRecursion(arr,numberOfElements-1);
        System.out.println(arr[numberOfElements]);
    }
}