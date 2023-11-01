import Controller.ArztController;
import Controller.PatientController;
import Repository.ArztRepo;
import UI.*;

public class Main {
    public static void main(String[] args) {
        ArztRepo ar = new ArztRepo();
        ArztController ac = new ArztController(ar);
        UserInterface ui = new UserInterface(ac);
        ui.start();
    }

}