import java.util.List;

public class StudentController implements UserController<Student>{

    private final StudentGroupService STUDENTGROUPSERVICE = new StudentGroupService();
    private final StreamService STREAMSERVICE;
    private final StudentView STUDENTVIEW = new StudentView();

    public StudentController(Stream stream) {
        this.STREAMSERVICE = new StreamService(stream);
    }

    public void removeStudentByFIO(String lastName, String firstName, String middleName){
        STUDENTGROUPSERVICE.removeStudentByFIO(lastName, firstName, middleName);
    }

    public List<Student> getSortedStudentList(){
        List<Student> studentList = STUDENTGROUPSERVICE.getSortedStudentList();
        STUDENTVIEW.sendOnConsole(studentList);
        return studentList;
    }

    public List<Student> getSortedByFIO(){
        List<Student> studentList = STUDENTGROUPSERVICE.getSortedByFIO();
        STUDENTVIEW.sendOnConsole(studentList);
        return studentList;
    }

    public List<StudentGroup> sortSteamByStudentGroupSize(){
        return STREAMSERVICE.sortSteamByStudentGroupSize();
    }


    @Override
    public void create(String firstName, String lastName, String middleName) {
        STUDENTGROUPSERVICE.createStudent(firstName, lastName, middleName);
    }
}
