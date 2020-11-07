//Count Subsequence Of Form ABC
import java.util.*;

import java.util.*;
public class Qns3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        countSubsequenceOfFormABC(str);
    }
    private static void countSubsequenceOfFormABC(String str) {
        int first = 0;
        int second = 0;
        int third = 0;
        for(int i = 0; i < str.length(); i++){
            char character = str.charAt(i);
            if(character == 'a'){
                first = 2 * first + 1;
            }else if(character == 'b'){
                second = 2 * second + first;
            }else {
                third = 2 * third + second;
            }
        }
        System.out.print(third);
    }
}