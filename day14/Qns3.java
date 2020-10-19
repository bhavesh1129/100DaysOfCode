import java.util.*;

//Print Zigzag
public class Qns3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        printZigzag(number);
    }

    private static void printZigzag(int number) {
        if(number==0){
            return;
        }
        System.out.print(number+" ");
        printZigzag(number-1);
        System.out.print(number+" ");
        printZigzag(number-1);
        System.out.print(number+" ");
    }
}
