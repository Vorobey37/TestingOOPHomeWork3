import java.util.*;

public class StudentGroupService {

    private StudentGroup studentGroup;

    public void removeStudentByFIO(String lastName, String firstName, String middleName){
        Iterator<Student> iterator = studentGroup.iterator();
        while (iterator.hasNext()){
            Student student = iterator.next();
            if (student.getLastName().equals(lastName) && student.getFirstName().equals(firstName) && student.getMiddleName().equals(middleName)){
                iterator.remove();
            }
        }
    }

    public List<Student> getSortedStudentList(){
        List<Student> students = new ArrayList<>(studentGroup.getStudents());
        Collections.sort(students);
        return students;
    }

    public List<Student> getSortedByFIO(){
        Comparator<Student> comparator = new UserComparator<Student>();
        List<Student> students = new ArrayList<>(studentGroup.getStudents());
        students.sort(comparator);
        return students;
    }

    public void createStudent(String firstName, String lastName, String middleName){
        studentGroup.createStudent(firstName, lastName, middleName);
    }
}
