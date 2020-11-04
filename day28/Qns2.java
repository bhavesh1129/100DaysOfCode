//Palindrome String
import java.util.*;

public class Qns2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        palindromeString(str);
    }

    private static void palindromeString(String str) {
        int i = 0;
        int j = str.length() - 1;
        boolean flag = false;
        while (i < j) {
            if (str.charAt(i) == str.charAt(j)) {
                i++;
                j--;
                flag = true;
            }
        }
        if(flag == true){
            System.out.print("1");
        }else{
            System.out.print("0");
        }
    }
}