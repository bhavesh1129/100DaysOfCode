//Reverse A String
import java.util.*;

public class Qns1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        reverseAString(str);
    }

    private static void reverseAString(String str) {
        char[] charArray = str.toCharArray();
        int i = 0;
        int j = str.length() - 1;
        while(i < j){
            char temp = charArray[i];
            charArray[i] = charArray[j];
            charArray[j] = temp;
            i++;
            j--;
        }
        System.out.print(charArray);
    }
}