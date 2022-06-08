import java.time.LocalDate;

abstract public class Person {
    private String name;
    private String registrationNumber;
    private boolean isStaff = false;

    public Person(String name, String registrationNumber) {
        this.name = name;
        this.registrationNumber = registrationNumber;
    }
    public Person(String name, String registrationNumber, boolean isStaff) {
        this.name = name;
        this.registrationNumber = registrationNumber;
        this.isStaff = isStaff;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }
    public String getRegistrationNumber() {
        return this.registrationNumber;
    }
    public void clockIn(LocalDate time) {
        System.out.println(this.name + " Clocking in at " + time.toString());
    }
    public void clockOut(LocalDate time) {
        System.out.println(this.name + " Clocking out at " + time.toString());
    }
    public boolean isStaff() {
        return this.isStaff;
    }
    public void setIsStaff(boolean isStaff) {
        this.isStaff = isStaff;
    }

}
