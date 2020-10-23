//Print Subsequence
import java.util.*;

public class Qns1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String originalString=sc.next();
        printSubsequence(originalString,"");
    }

    private static void printSubsequence(String originalString, String remainingString) {
        if(originalString.length()==0){
            System.out.println(remainingString);
            return;
        }
        char firstCharacter=originalString.charAt(0);
        String leftString=originalString.substring(1);
        printSubsequence(leftString, remainingString+firstCharacter);
        printSubsequence(leftString, remainingString+"");
    }
}