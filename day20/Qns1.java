//Factorial of Larger Numbers
import java.util.*;

public class Qns1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sizeOfArray = sc.nextInt();
        int[] arr = new int[sizeOfArray];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        factorialOfALargerNumber(arr);
    }

    private static void factorialOfALargerNumber(int[] arr) {

        int indexOfArray = 0;
        while(indexOfArray < arr.length){
            int fact=1;
            for (int i = 1; i <= arr[indexOfArray]; i++) {
                fact = fact * i;
             }
            System.out.println(fact);
            indexOfArray++;
        }
    }
}