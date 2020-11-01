//Fibonacci Using DP
import java.util.*;

public class Qns3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int result = fibonacciUsingDP(number,new int[number + 1]);
        System.out.print(result);
    }

    private static int fibonacciUsingDP(int number,int[] store) {
        if (number == 0 || number == 1) {
            return number;
        }
        if(store[number] != 0){
            return store[number];
        }
        int fibo1 = fibonacciUsingDP(number - 1, store);
        int fibo2 = fibonacciUsingDP(number - 2, store);
        int fibn = fibo1 + fibo2;
        store[number] = fibn;
        return fibn;
    }
}