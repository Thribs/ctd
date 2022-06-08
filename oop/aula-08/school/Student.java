public class Student extends Person {

    
    public Student(String name, String registrationNumber) {
        super(name, registrationNumber);
    }

    public void study() {
        System.out.println(this.getName() + ": I'm studying!");
    }
}
