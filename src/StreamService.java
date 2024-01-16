import java.util.List;

public class StreamService {

    private Stream stream;

    public StreamService(Stream stream) {
        this.stream = stream;
    }

    public List<StudentGroup> sortSteamByStudentGroupSize(){
        List<StudentGroup> studentGroups = stream.getStudentGroups();
        StreamComparator streamComparator = new StreamComparator();
        studentGroups.sort(streamComparator);
        return studentGroups;
    }
}
