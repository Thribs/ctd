import java.time.LocalDate;

public class App {
    public static void main(String[] args) throws Exception {
        // School
        School school = new School("School of Code", "School of Code", "2019", "2020", "School of Code", "School of Code",
                "School of Code", "School of Code", "School of Code", "School of Code", "School of Code", "School of Code",
                new Student[] { new Student("John", "123456789"), new Student("Jane", "987654321") },
                new Professor[] { new Professor("John", "123456789", null, null), new Professor("Jane", "987654321", null, null) },
                new StaffMember[] { new StaffMember("John", "123456789", "Teacher"),
                        new StaffMember("Jane", "987654321", "Teacher") });
        System.out.println(school.getName());
        System.out.println(school.getAddress());
        System.out.println(school.getPhoneNumber());
        System.out.println(school.getEmail());
        System.out.println(school.getWebsite());
        System.out.println(school.getPrincipal());
        System.out.println(school.getSchoolBoard());
        System.out.println(school.getSchoolType());
        System.out.println(school.getSchoolLevel());
        System.out.println(school.getSchoolYear());
        System.out.println(school.getSchoolYearStart());
        System.out.println(school.getSchoolYearEnd());

        // Students
        Student student1 = new Student("John Doe", "123456789");
        Student student2 = new Student("Jane Doe", "987654321");
        Student student3 = new Student("Joe Doe", "123456789");
        Student student4 = new Student("Jill Doe", "987654321");
        Student student5 = new Student("Jack Doe", "123456789");

        // Professors
        Professor professor1 = new Professor("Mr. Code", "123456789", "Professor", 5);
        Professor professor2 = new Professor("Ms. Code", "987654321", "Professor", 5);
        Professor professor3 = new Professor("Mr. Code", "123456789", "Professor", 5);
        Professor professor4 = new Professor("Ms. Code", "987654321", "Professor", 5);
        Professor professor5 = new Professor("Mr. Code", "123456789", "Professor", 5);

        // StaffMembers
        StaffMember staffMember1 = new StaffMember("Mr. Code", "123456789", "Janitor");
        StaffMember staffMember2 = new StaffMember("Ms. Code", "987654321", "Janitor");
        StaffMember staffMember3 = new StaffMember("Mr. Code", "123456789", "Janitor");
        StaffMember staffMember4 = new StaffMember("Ms. Code", "987654321", "Janitor");
        StaffMember staffMember5 = new StaffMember("Mr. Code", "123456789", "Janitor");

        // Add students to school
        school.addStudent(student1);
        school.addStudent(student2);
        school.addStudent(student3);
        school.addStudent(student4);
        school.addStudent(student5);

        // Add professors to school
        school.addProfessor(professor1);
        school.addProfessor(professor2);
        school.addProfessor(professor3);
        school.addProfessor(professor4);
        school.addProfessor(professor5);

        // Add staff members to school
        school.addStaffMember(staffMember1);
        school.addStaffMember(staffMember2);
        school.addStaffMember(staffMember3);
        school.addStaffMember(staffMember4);
        school.addStaffMember(staffMember5);

        // Print out students
        System.out.println("Students:");
        for (Student student : school.getStudents()) {
            System.out.println(student.getName());
        }

        // Print out professors
        System.out.println("Professors:");
        for (Professor professor : school.getProfessors()) {
            System.out.println(professor.getName());
        }

        // Print out staff members
        System.out.println("Staff Members:");
        for (StaffMember staffMember : school.getStaffMembers()) {
            System.out.println(staffMember.getName());
        }

        // Students studying
        student1.study();
        student2.study();
        student3.study();
        student4.study();
        student5.study();

        // Professors teaching
        professor1.teach(student5);
        professor2.teach(student4);
        professor3.teach(student3);
        professor4.teach(student2);
        professor5.teach(student1);

        // Persons clocking in
        staffMember1.clockIn(
                LocalDate.of(2019, 9, 1));
        student2.clockIn(
                LocalDate.of(2019, 9, 1));
        professor4.clockIn(
                LocalDate.of(2019, 9, 1));
        staffMember4.clockIn(
                LocalDate.of(2019, 9, 1));
        student5.clockIn(
                LocalDate.of(2019, 9, 1));

        // Persons clocking out
        staffMember1.clockOut(
                LocalDate.of(2019, 9, 1));
        student2.clockOut(
                LocalDate.of(2019, 9, 1));
        professor4.clockOut(
                LocalDate.of(2019, 9, 1));
        staffMember4.clockOut(
                LocalDate.of(2019, 9, 1));
        student5.clockOut(
                LocalDate.of(2019, 9, 1));

    }
}
