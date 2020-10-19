import java.util.Scanner;

public class Qns1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        decreasingUsingRecursion(size);
    }

    private static void decreasingUsingRecursion(int size) {
        if(size==0){
            return;
        }
        System.out.println(size);
        decreasingUsingRecursion(size-1);
    }
}
