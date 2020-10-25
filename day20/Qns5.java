//Print Permutations
import java.util.*;

public class Qns5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        printPermutations(str,"");
    }

    private static void printPermutations(String str, String stringSoFar) {
        if(str.length() == 0){
            System.out.println(stringSoFar);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char character =  str.charAt(i);
            String leftSideCharacters = str.substring(0, i);
            String rightSideCharacters = str.substring(i + 1);
            String leftString = leftSideCharacters + rightSideCharacters;
            printPermutations(leftString, stringSoFar + character);
        }
    }
}
