package UI;

import java.util.ArrayList;
import java.util.Scanner;

public class ReadFromUserDoctor implements ReadFromUserInterface {
    public static ArrayList<String> readNewObjectData() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> newObjectData = new ArrayList<String>();
        System.out.print("ID of the Doctor: ");
        newObjectData.add(scanner.nextLine());
        System.out.print("Last Name of the Doctor: ");
        newObjectData.add(scanner.nextLine());
        System.out.print("First Name of the Doctor: ");
        newObjectData.add(scanner.nextLine());
        System.out.print("Birthday of the Doctor: ");
        newObjectData.add(scanner.nextLine());
        System.out.print("HospitalID of the Doctor: ");
        newObjectData.add(scanner.nextLine());
        System.out.print("Phone Number of the Doctor: ");
        newObjectData.add(scanner.nextLine());
        System.out.print("SpecialityID of the Doctor: ");
        newObjectData.add(scanner.nextLine());
        System.out.print("OfficeID of the Doctor: ");
        newObjectData.add(scanner.nextLine());
        return newObjectData;
    }
    public static ArrayList<String> readIdentifier() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> newObjectData = new ArrayList<String>();
        System.out.print("ID of the Doctor: ");
        newObjectData.add(scanner.nextLine());
        return newObjectData;
    }

}
