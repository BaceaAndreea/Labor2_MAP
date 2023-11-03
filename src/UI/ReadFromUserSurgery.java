package UI;

import java.util.ArrayList;
import java.util.Scanner;

public class ReadFromUserSurgery implements ReadFromUserInterface {
    public static ArrayList<String> readNewObjectData() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> newObjectData = new ArrayList<String>();
        System.out.print("ID of the Patient: ");
        newObjectData.add(scanner.nextLine());
        System.out.print("ID of the Doctor: ");
        newObjectData.add(scanner.nextLine());
        System.out.println("Date: ");
        newObjectData.add(scanner.nextLine());
        System.out.println("ID of the Disease");
        newObjectData.add(scanner.nextLine());
        System.out.println("Name of the surgery: ");
        newObjectData.add(scanner.nextLine());
        System.out.println("ID of the medication: ");
        newObjectData.add(scanner.nextLine());
        return newObjectData;
    }
    public static ArrayList<String> readIdentifier() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> newObjectData = new ArrayList<String>();
        System.out.print("ID of the Patient: ");
        newObjectData.add(scanner.nextLine());
        System.out.print("ID of the Doctor: ");
        newObjectData.add(scanner.nextLine());
        System.out.println("Date: ");
        return newObjectData;
    }

}
