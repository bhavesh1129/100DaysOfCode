import java.util.*;

public class Qns2 {
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
        System.out.println(arr[numberOfElements]);
        displayArrayUsingRecursion(arr,numberOfElements-1);
    }
}