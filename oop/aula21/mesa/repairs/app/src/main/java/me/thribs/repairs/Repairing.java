import java.util.List;

public class Repairing implements RepairState {

    private Repair repair;

    public Repairing(Repair repair) {
        this.repair = repair;
    }

    @Override
    public void budget(double budget) {
        throw new UnsupportedOperationException("Repairing state does not support budgeting");   
    }

    @Override
    public void sumParts(List<Part> parts) {
        for (Part part : parts) {
            repair.setCost(repair.getCost() + part.getPrice());
        }
        
    }

    @Override
    public void changeAddress(String address) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void nextState() {
        // TODO Auto-generated method stub
        
    }
    
    
}
