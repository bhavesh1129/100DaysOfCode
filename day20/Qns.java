//Print Encodings
import java.util.*;

public class Qns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        printEncodings(str,"");
    }

    private static void printEncodings(String str, String stringSoFar) {
        if(str.length() == 0){
            System.out.println(stringSoFar);
            return;
        }else if(str.length() == 1){
            char character = str.charAt(0);
            if(character == '0'){
                return;
            }else{
                int characterValue = character - '0';
                char code = (char)('a' + characterValue - 1);
                stringSoFar += code;
                System.out.println(stringSoFar);
            }
        }else{
            char character = str.charAt(0);
            String leftString = str.substring(1);

            if(character == '0'){
                return;
            }else{
                int characterValue = character - '0';
                char code = (char)('a' + characterValue - 1);
                printEncodings(leftString, stringSoFar + code);
            }

            String twoCharacters = str.substring(0,2);
            String stringLeft = str.substring(2);

            int twoCharactersValue = Integer.parseInt(twoCharacters);
            if(twoCharactersValue <= 26){
                char code = (char)('a' + twoCharactersValue - 1);
                printEncodings(stringLeft, stringSoFar + code);
            }
        }
    }
}
