import java.util.*;

public class Qns3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
         printincreasingAndDecreasingUsingRecursion(size);
    }

    private static void printincreasingAndDecreasingUsingRecursion(int size) {
        if(size==0){
            return;
        }
        System.out.println(size);
        printincreasingAndDecreasingUsingRecursion(size-1);
        System.out.println(size);
    }
}
