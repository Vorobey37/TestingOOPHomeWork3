import java.util.List;

public class TeacherListView implements UserView<Teacher>{
    @Override
    public void sendOnConsole(List<Teacher> list) {
        for(Teacher teacher : list){
            System.out.println(teacher);
        }
    }
}
