public class StaffMember extends Person {
    private String occupation;

    public StaffMember(String name, String registrationNumber, String occupation) {
        super(name, registrationNumber, true);
        this.occupation = occupation;
    }
}
