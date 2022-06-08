public class Physician {
    private Integer registrationNumber;
    private String name;
    private String crm;
    private Double fee;

    public Physician(Integer registrationNumber, String name, String crm, Double fee) {
        this.registrationNumber = registrationNumber;
        this.name = name;
        this.crm = crm;
        this.fee = fee;
    }
}