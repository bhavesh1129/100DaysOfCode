//Subsequence Of A String
import java.util.*;

public class Qns5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] stringArray = {"a", "b", "c"};
        subString(stringArray);
    }

    private static void subString(String[] stringArray) {
        for (int i = 0; i < stringArray.length; i++) {
            for (int j = i; j < stringArray.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(stringArray[k]);
                }
                System.out.println();
            }
        }
    }
}
