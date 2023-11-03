package UI;

import java.util.ArrayList;
import java.util.Scanner;

public class ReadFromUserPatient implements ReadFromUserInterface {
    public static ArrayList<String> readNewObjectData() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> newObjectData = new ArrayList<String>();
        System.out.print("ID of the Patient: ");
        newObjectData.add(scanner.nextLine());
        System.out.print("Last Name of the Patient: ");
        newObjectData.add(scanner.nextLine());
        System.out.print("First Name of the Patient: ");
        newObjectData.add(scanner.nextLine());
        System.out.print("Birthday of the Patient: ");
        newObjectData.add(scanner.nextLine());
        System.out.print("Phone Number of the Patient: ");
        newObjectData.add(scanner.nextLine());
        System.out.print("HealthcardID of the Patient: ");
        newObjectData.add(scanner.nextLine());
        return newObjectData;
    }
    public static ArrayList<String> readIdentifier() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> newObjectData = new ArrayList<String>();
        System.out.print("ID of the Patient: ");
        newObjectData.add(scanner.nextLine());
        return newObjectData;
    }

}
