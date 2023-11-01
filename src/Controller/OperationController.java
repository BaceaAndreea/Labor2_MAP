package Controller;
import Repository.*;
import Domain.*;

import java.util.ArrayList;
import java.util.Date;

public class OperationController {
    private final OperationRepo operationRepo;

    public OperationController(OperationRepo operationRepo) {
        this.operationRepo = operationRepo;
    }

    public void addOperation(int patientID, int arztID, String datum, int krankenheitid, String name, int medikamentID){
        if(operationRepo != null) {
            if (arztID < 0 || patientID < 0) {
                throw new IllegalArgumentException("ArztID and PatientID are positive.");
            }
            for (Operation operation : operationRepo.readAll()) {
                if (operation.getArztID() == arztID && operation.getPatientID() == patientID && operation.getDatum().equals(datum)) {
                    throw new IllegalArgumentException("Combination ArztID + PatientID + Date is unique for operation.");
                }
            }
        }
        Operation newOperation = new Operation(patientID, arztID, datum, krankenheitid, name, medikamentID);
        operationRepo.add(newOperation);
    }
    public boolean findOperation(int arztID, int patientID, String datum){
        for(Operation operation : operationRepo.readAll()){
            if(operation.getArztID() == arztID && operation.getPatientID() == patientID && operation.getDatum().equals(datum) ) {
                return true;
            }
        }
        return false;
    }
    public void deleteOperation(int arztID, int patientID, String datum) {
        boolean found = findOperation(arztID, patientID, datum);
        if (!found) {
            throw new IllegalArgumentException("Combination ArztID + PatientID + Date not found");
        } else {
            for (Operation operation : operationRepo.readAll()) {
                if (operation.getArztID() == arztID && operation.getPatientID() == patientID && operation.getDatum().equals(datum) ) {
                    operationRepo.delete(operation);
                    break;
                }

            }
        }
    }

    public void updateOperation(int patientID, int arztID, String datum, int krankenheitid, String name, int medikamentID) {
        boolean found = findOperation(arztID, patientID, datum);
        if (found == false) {
            throw new IllegalArgumentException("ArztID not found");
        } else {
            for (Operation operation : operationRepo.readAll()) {
                if (operation.getArztID() == arztID && operation.getPatientID() == patientID && operation.getDatum().equals(datum) ) {
                    Operation newOperation = new Operation(patientID, arztID, datum, krankenheitid, name, medikamentID);
                    operationRepo.update(operation, newOperation);
                }
            }
        }
    }

    public ArrayList<Operation> readAll(){
        return operationRepo.readAll();
    }
}
