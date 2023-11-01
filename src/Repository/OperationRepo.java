package Repository;

import Domain.Operation;

import java.util.ArrayList;

public class OperationRepo implements RepositoryInterface<Operation> {
    private final ArrayList<Operation> operationen = new ArrayList<Operation>();

    @Override
    public void add(Operation newOperation) {
        operationen.add(newOperation);
    }

    @Override
    public void delete(Operation deletedOpertationen) {
        operationen.remove(deletedOpertationen);
    }

    @Override
    public void update(Operation oldObject, Operation newObject) {
        int index = operationen.indexOf(oldObject);
        if (index != -1) {
            operationen.set(index, newObject);
        }
    }

    @Override
    public ArrayList<Operation> readAll() {
        return operationen;
    }
}
