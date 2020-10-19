//Power Linear
import java.util.*;

public class Qns2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int power=sc.nextInt();
        int result=powerLinear(number,power);
        System.out.print(result);
    }

    private static int powerLinear(int number, int power) {
        if(power!=0){
            return (number*powerLinear(number, power-1));
        }else{
            return 1;
        }
    }
}
