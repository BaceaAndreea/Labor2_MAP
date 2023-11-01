import Controller.*;
import Domain.Krankheit;
import Repository.*;
import UI.*;

public class Main {
    public static void main(String[] args) {
        ArztRepo ar = new ArztRepo();
        PatientRepo pr = new PatientRepo();
        OperationRepo or = new OperationRepo();
        MedikamentRepo mr = new MedikamentRepo();
        SpezialisierungRepo sr = new SpezialisierungRepo();
        KrankheitRepo kr = new KrankheitRepo();
        KabinettRepo kr2 = new KabinettRepo();
        BeratungRepo br = new BeratungRepo();

        ArztController ac = new ArztController(ar);
        PatientController pc = new PatientController(pr);
        OperationController oc = new OperationController(or);
        MedikamenteController mc = new MedikamenteController(mr);
        SpezialisierungController sc = new SpezialisierungController(sr);
        KrankheitController kc = new KrankheitController(kr);
        Kabinettcontroller kc2 = new Kabinettcontroller(kr2);
        BeratungController bc = new BeratungController(br);

        UserInterface ui = new UserInterface(ac, pc, mc,oc, sc, kc, kc2, bc);
        ui.start();
    }

}