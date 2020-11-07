//Arrage Buildings
import java.util.*;

public class Qns2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long lengthOfRoad = sc.nextInt();
        arrageBuildings(lengthOfRoad);
    }

    private static void arrageBuildings(long lengthOfRoad) {
        long oldBuilding = 1;
        long oldSpace = 1;
        for (long i = 2; i <= lengthOfRoad; i++) {
            long newBuilding = oldSpace;
            long newSpace = oldBuilding + oldSpace;
            oldBuilding = newBuilding;
            oldSpace = newSpace;
        }
        System.out.println((oldSpace + oldBuilding) * (oldSpace + oldBuilding));
    }
}