//Substring With Equal 0's And 1's
import java.util.*;

public class Qns4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(substringWithEqual0And1(str));
    }

    private static int substringWithEqual0And1(String str) {
        int countOfZero = 0;
        int countOfOne = 0;
        int count = 0;// count of equal substring
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '0') {
                countOfZero++;
            } else if (str.charAt(i) == '1') {
                countOfOne++;
            }
            if (countOfOne == countOfZero) {
                count++;
            }
        }
        if (countOfOne != countOfZero) {
            return -1;
        }
        return count;
    }
}
