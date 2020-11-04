//One String Is Rotation Of Other
import java.util.*;

public class Qns4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        
        if(oneStringIsRotationOfOther(str1, str2)){
            System.out.println("Strings are rotations of each other");
        }else{
            System.out.println("Strings are not rotations of each other");
        }
    }

    private static boolean oneStringIsRotationOfOther(String str1, String str2) {

       return (str1.length() == str2.length() && (str1 + str1).indexOf(str2) != -1);
    }
}
