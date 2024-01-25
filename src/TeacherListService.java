public class TeacherListService {
    private TeacherList teachers;

    public void createTeacher(String firstName, String lastName, String middleName){
        teachers.createTeacher(firstName, lastName, middleName);
    }

    public void editTeacherByID(int id, String firstName, String lastName, String middleName){
        teachers.editTeacherByID(id, firstName, lastName, middleName);
    }

}
