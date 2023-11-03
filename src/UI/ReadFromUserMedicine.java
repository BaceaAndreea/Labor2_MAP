package UI;

import java.util.ArrayList;
import java.util.Scanner;

public class ReadFromUserMedicine implements ReadFromUserInterface {
    public static ArrayList<String> readNewObjectData() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> newObjectData = new ArrayList<String>();
        System.out.print("ID of the Medicine: ");
        newObjectData.add(scanner.nextLine());
        System.out.print("Name of the Medicine: ");
        newObjectData.add(scanner.nextLine());
        System.out.print("Way of administration of the Medicine: ");
        newObjectData.add(scanner.nextLine());
        System.out.print("Quantity of the Medicine: ");
        newObjectData.add(scanner.nextLine());
        System.out.print("Expiring Date of the Medicine: ");
        newObjectData.add(scanner.nextLine());
        return newObjectData;
    }
    public static ArrayList<String> readIdentifier() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> newObjectData = new ArrayList<String>();
        System.out.print("ID of the Medicine: ");
        newObjectData.add(scanner.nextLine());
        return newObjectData;
    }

}
