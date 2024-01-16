import java.util.List;

public class Controller {

    private final StudentGroupService STUDENTGROUPSERVICE = new StudentGroupService();
    private final StreamService STREAMSERVICE;

    public Controller(Stream stream) {
        this.STREAMSERVICE = new StreamService(stream);
    }

    public void removeStudentByFIO(String lastName, String firstName, String middleName){
        STUDENTGROUPSERVICE.removeStudentByFIO(lastName, firstName, middleName);
    }

    public List<Student> getSortedStudentList(){
        return STUDENTGROUPSERVICE.getSortedStudentList();
    }

    public List<Student> getSortedByFIO(){
        return STUDENTGROUPSERVICE.getSortedByFIO();
    }

    public List<StudentGroup> sortSteamByStudentGroupSize(){
        return STREAMSERVICE.sortSteamByStudentGroupSize();
    }


}
