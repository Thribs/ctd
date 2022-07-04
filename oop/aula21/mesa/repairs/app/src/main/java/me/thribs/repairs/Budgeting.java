import java.util.List;

public class Budgeting implements RepairState {

    private Repair repair;

    public Budgeting(Repair repair) {
        this.repair = repair;
    }

    @Override
    public void budget(double cost) {
        this.repair.setCost(cost);
    }

    @Override
    public void sumParts(List<Part> parts) {
        throw new UnsupportedOperationException("Budgeting state does not support adding parts");
    }

    @Override
    public void changeAddress(String address) {
        throw new UnsupportedOperationException("Budgeting state does not support changing address");
    }

    @Override
    public void nextState() {
        repair.setState(new Repairing(repair));
    }

}
