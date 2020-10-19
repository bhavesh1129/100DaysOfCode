import java.util.*;

public class Qns4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int fact=factoialOfANumber(number);
        System.out.println(fact);
    }

    private static int factoialOfANumber(int number) {
        if(number>=1){
            return (number * factoialOfANumber(number-1));
        }else{
            return 1;
        }
    }
}
