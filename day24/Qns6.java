//Permutation 
import java.util.*;

public class Qns6{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        nextPermutation(str,"");
    }

    private static void nextPermutation(String str, String stringSoFar) {
        if(str.length() == 0){
            System.out.println(stringSoFar);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char firstCharacter = str.charAt(i);
            String leftSideCharacters = str.substring(0, i);
            String rightSideCharacters = str.substring(i + 1);
            String remainingString = leftSideCharacters + rightSideCharacters;
            nextPermutation(remainingString, stringSoFar + firstCharacter);
        }
    }
}
