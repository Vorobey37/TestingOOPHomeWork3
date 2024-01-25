public class Student extends User implements Comparable<Student>{



    public Student(String firstName, String lastName, String middleName) {
        super(firstName, lastName, middleName);
    }



    @Override
    public int compareTo(Student o) {
        return this.getUserID().compareTo(o.getUserID());
    }
}
