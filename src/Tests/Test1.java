package Tests;

import Controller.ArztController;
import Controller.KrankheitController;
import Controller.PatientController;
import Domain.Arzt;
import Domain.Krankheit;
import Domain.Patient;
import Repository.ArztRepo;
import Repository.KrankheitRepo;
import Repository.PatientRepo;
import org.junit.Test;


import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

public class Test1 {
    PatientRepo pr = new PatientRepo();
    PatientController pc = new PatientController(pr);



    @Test
    public void addUpdateDeleteDoctor() {
        ArztRepo ar = new ArztRepo();
        ArztController ac = new ArztController(ar);
        Arzt johnDoctor = new Arzt(101, "Smith", "John", "19990302", 303,  "5553456236", 100, 200);
        ac.addArzt(101, "Smith", "John", "19990302", 303, "5553456236", 100, 200);
        ArrayList<Arzt> arzte = ac.readAll();
        assertEquals(arzte.get(0).toString(), johnDoctor.toString());
        System.out.println("Add Test Doctor successful");
        ac.updateArzt(101, "Smith", "Johnathan", "20000302", 303, "5553456236", 100, 200);
        Arzt johnathanDoctor = new Arzt(101, "Smith", "Johnathan", "20000302", 303, "5553456236", 100, 200);
        arzte = ac.readAll();
        assertEquals(arzte.get(0).toString(), johnathanDoctor.toString());
        System.out.println("Update Test Doctor successful");
        ac.deleteArzt(101);
        arzte = ac.readAll();
        assertTrue(arzte.isEmpty());
        System.out.println("Delete Test Doctor successful");
    }



    @Test
    public void addUpdateDeletePatient() {
        Patient anaPateint = new Patient(1001, "Abrac", "Ana", "19920208", "7778656542", 101);
        pc.addPatient(1001, "Abrac", "Ana", "19920208", "7778656542", 101);
        ArrayList<Patient> patienten = pc.readAll();
        assertEquals(patienten.get(0).toString(), anaPateint.toString());
        System.out.println("Add Test Patient successful");
        pc.updatePateint(1001, "Abrac", "Ana", "20000408", "7778656542", 101);
        Patient mariaPatient = new Patient(1001, "Abrac", "Ana", "20000408", "7778656542", 101);
        patienten = pc.readAll();
        assertEquals(patienten.get(0).toString(), mariaPatient.toString());
        System.out.println("Update Test Patient successful");
        pc.deletePateint(1001);
        patienten = pc.readAll();
        assertTrue(patienten.isEmpty());
        System.out.println("Delete Test Patient successful");

    }

    @Test
    public void addUpdateDeleteIllness(){
        KrankheitRepo kr = new KrankheitRepo();
        KrankheitController kc = new KrankheitController(kr);
        Krankheit badIlness = new Krankheit(101, "Bad Illness");
        kc.addKrankheit(101, "Bad Illness");
        ArrayList<Krankheit> krankheits = kc.readAll();
        assertEquals(krankheits.get(0).toString(), badIlness.toString());
        System.out.println("Add Test Illness successful");
        kc.updateKrankheit(101, "Very Bad Illness");
        krankheits = kc.readAll();
        Krankheit veryBadIlness = new Krankheit(101, "Very Bad Illness");
        assertEquals(krankheits.get(0).toString(), veryBadIlness.toString());
        System.out.println("Update Test Illness successful");
        kc.deleteKrankheit(101);
        krankheits = kc.readAll();
        assertTrue(krankheits.isEmpty());
        System.out.println("Delete Test Illness successful");
    }

}