//Duplicate Characters In A String
import java.util.*;

public class Qns3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        duplicateCharactersInAString(str);
    }

    private static void duplicateCharactersInAString(String str) {
        //Number of ASCII Characters are 256 (0-255)
        int[] count = new int[256];
        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i)]++;
        }
        for (int i = 0; i < count.length; i++) {
            if(count[i] > 1){
                System.out.println((char)(i)+" "+ count[i]);
            }
        }
    }
}
