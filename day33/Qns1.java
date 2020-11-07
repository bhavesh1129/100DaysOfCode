//Count Binary
import java.util.*;

public class Qns1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        countBinary(num);
    }

    private static void countBinary(int num) {
        int oldCountZeros = 1;
        int oldCountOnes = 1;
        for (int i = 2; i <= num; i++) {
            int newCountZeros = oldCountOnes;
            int newCountOnes = oldCountZeros + oldCountOnes;
            oldCountOnes = newCountOnes;
            oldCountZeros = newCountZeros;
        }
        System.out.print(oldCountZeros + oldCountOnes);
    }
}