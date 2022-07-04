import java.util.List;

public interface RepairState {
    void budget(double budget);

    void sumParts(List<Part> parts);

    void changeAddress(String address);

    void nextState();
}