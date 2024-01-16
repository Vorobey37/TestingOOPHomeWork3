import java.util.Iterator;
import java.util.List;

public class StudentGroupIterator implements Iterator<Student> {

    private int count;
    private List<Student> students;

    public StudentGroupIterator(StudentGroup studentGroup) {
        this.count = 0;
        this.students = studentGroup.getStudents();
    }

    @Override
    public boolean hasNext() {
        return count < (students.size() - 1);
    }

    @Override
    public Student next() {
        if (!hasNext()){
            return null;
        }
        count++;
        return students.get(count);
    }

    @Override
    public void remove() {
        students.remove(count);
    }
}
