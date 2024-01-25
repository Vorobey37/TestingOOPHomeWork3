import java.util.List;

public class TeacherController implements UserController<Teacher>{

    private final TeacherListService TEACHERLISTSERVICE = new TeacherListService();
    private final TeacherListView TEACHERLISTVIEW = new TeacherListView();

    @Override
    public void create(String firstName, String lastName, String middleName) {
        TEACHERLISTSERVICE.createTeacher(firstName, lastName, middleName);
    }

    public void editTeacherByID(int id, String firstName, String lastName, String middleName){
        TEACHERLISTSERVICE.editTeacherByID(id, firstName, lastName, middleName);
    }

    public void sendOnConsole(List<Teacher> list){
        TEACHERLISTVIEW.sendOnConsole(list);
    }
}
