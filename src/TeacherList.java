import java.util.ArrayList;
import java.util.List;

public class TeacherList {
    private List<Teacher> teachers;

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public TeacherList(){
        this.teachers = new ArrayList<>();
    }

    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }

    public void createTeacher(String firstName, String lastName, String middleName){
        teachers.add(new Teacher(firstName, lastName, middleName));
    }

    public void editTeacherByID(int id, String firstName, String lastName, String middleName){
        int count = 0;
        for(Teacher teacher : teachers){
            if (teacher.getUserID() == id){
                teacher.setFirstName(firstName);
                teacher.setLastName(lastName);
                teacher.setMiddleName(middleName);
                count++;
            }
        }
        if (count == 0){
            System.out.println("Нет такого учителя!");
        }
    }

}
