import java.util.Scanner;

public class Qns2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        increasingUsingRecursion(size);
    }

    private static void increasingUsingRecursion(int size) {
        if(size==0){
            return;
        }
        increasingUsingRecursion(size-1);
        System.out.println(size);
    }
}