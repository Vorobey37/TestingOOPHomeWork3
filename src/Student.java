public class Student implements Comparable<Student>{

    private Integer studentID;
    private String lastName;
    private String firstName;
    private String middleName;

    public int getStudentID() {
        return studentID;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    @Override
    public int compareTo(Student o) {
        return this.studentID.compareTo(o.getStudentID());
    }
}
