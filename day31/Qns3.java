//Permutations Of A Given String
import java.util.*;

public class Qns3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        permutationsOfAGivenString(str,"");
    }

    private static void permutationsOfAGivenString(String str, String storeString) {
        if(str.length() == 0){
            System.out.println(storeString);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char firstCharacter = str.charAt(i);
            String leftString = str.substring(0,i);
            String rightString = str.substring(i + 1);
            String combinedString = leftString + rightString;
            permutationsOfAGivenString(combinedString,storeString+firstCharacter);
        }
    }
}