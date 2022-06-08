public class Professor extends Person {
    private String title;
    private Integer teachingYears;

    public Professor(String name, String registrationNumber, String title, Integer teachingYears) {
        super(name, registrationNumber);
        this.title = title;
        this.teachingYears = teachingYears;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public Integer getTeachingYears() {
        return teachingYears;
    }
    public void setTeachingYears(Integer teachingYears) {
        this.teachingYears = teachingYears;
    }
    public void teach(Student student) {
        System.out.println(this.getName() + " is teaching " + student.getName());
    }
    
}
