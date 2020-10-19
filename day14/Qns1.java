
//Power Logarithmic
import java.util.*;
public class Qns1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int power=sc.nextInt();
        int result=powerLogarithmic(number,power);
        System.out.print(result);
    }

    private static int powerLogarithmic(int number, int power) {
        if(power==0){
            return 1;
        }
        int value=powerLogarithmic(number, power/2)*powerLogarithmic(number, power/2);
        if(power%2==1){
            value=value*number;
        }
        return value;
    }
}