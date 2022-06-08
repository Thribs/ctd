public class School {
    private String name;
    private String address;
    private String phoneNumber;
    private String email;
    private String website;
    private String principal;
    private String schoolBoard;
    private String schoolType;
    private String schoolLevel;
    private String schoolYear;
    private String schoolYearStart;
    private String schoolYearEnd;
    private Student[] students;
    private Professor[] professors;
    private StaffMember[] staffMembers;

    public School(String schoolLevel, String schoolYear, String schoolYearStart, String schoolYearEnd, String name,
            String address, String phoneNumber, String email, String website, String principal, String schoolBoard,
            String schoolType, Student[] students, Professor[] professors, StaffMember[] staffMembers) {
        this.schoolLevel = schoolLevel;
        this.schoolYear = schoolYear;
        this.schoolYearStart = schoolYearStart;
        this.schoolYearEnd = schoolYearEnd;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.website = website;
        this.principal = principal;
        this.schoolBoard = schoolBoard;
        this.schoolType = schoolType;
        this.students = students;
        this.professors = professors;
        this.staffMembers = staffMembers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getPrincipal() {
        return principal;
    }

    public void setPrincipal(String principal) {
        this.principal = principal;
    }

    public String getSchoolBoard() {
        return schoolBoard;
    }

    public void setSchoolBoard(String schoolBoard) {
        this.schoolBoard = schoolBoard;
    }

    public String getSchoolType() {
        return schoolType;
    }

    public void setSchoolType(String schoolType) {
        this.schoolType = schoolType;
    }

    public String getSchoolLevel() {
        return schoolLevel;
    }

    public void setSchoolLevel(String schoolLevel) {
        this.schoolLevel = schoolLevel;
    }

    public String getSchoolYear() {
        return schoolYear;
    }

    public void setSchoolYear(String schoolYear) {
        this.schoolYear = schoolYear;
    }

    public String getSchoolYearStart() {
        return schoolYearStart;
    }

    public void setSchoolYearStart(String schoolYearStart) {
        this.schoolYearStart = schoolYearStart;
    }

    public String getSchoolYearEnd() {
        return schoolYearEnd;
    }

    public void setSchoolYearEnd(String schoolYearEnd) {
        this.schoolYearEnd = schoolYearEnd;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public Professor[] getProfessors() {
        return professors;
    }

    public void setProfessors(Professor[] professors) {
        this.professors = professors;
    }

    public StaffMember[] getStaffMembers() {
        return staffMembers;
    }

    public void setStaffMembers(StaffMember[] staffMembers) {
        this.staffMembers = staffMembers;
    }

    public void addStudent(Student student) {
        Student[] newStudents = new Student[students.length + 1];
        for (int i = 0; i < students.length; i++) {
            newStudents[i] = students[i];
        }
        newStudents[students.length] = student;
        students = newStudents;
    }

    public void addProfessor(Professor professor) {
        Professor[] newProfessors = new Professor[professors.length + 1];
        for (int i = 0; i < professors.length; i++) {
            newProfessors[i] = professors[i];
        }
        newProfessors[professors.length] = professor;
        professors = newProfessors;
    }

    public void addStaffMember(StaffMember staffMember) {
        StaffMember[] newStaffMembers = new StaffMember[staffMembers.length + 1];
        for (int i = 0; i < staffMembers.length; i++) {
            newStaffMembers[i] = staffMembers[i];
        }
        newStaffMembers[staffMembers.length] = staffMember;
        staffMembers = newStaffMembers;
    }
}
