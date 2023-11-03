package UI;

import java.util.ArrayList;
import java.util.Scanner;

public class ReadFromUserHospital implements ReadFromUserInterface {
    public static ArrayList<String> readNewObjectData() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> newObjectData = new ArrayList<String>();
        System.out.print("HospitalId: ");
        newObjectData.add(scanner.nextLine());
        System.out.print("Name Speciality: ");
        newObjectData.add(scanner.nextLine());
        System.out.println("Capacity: ");
        newObjectData.add(scanner.nextLine());
        return newObjectData;
    }
    public static ArrayList<String> readIdentifier() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> newObjectData = new ArrayList<String>();
        System.out.print("ID of the Hospital: ");
        newObjectData.add(scanner.nextLine());
        return newObjectData;
    }

}
