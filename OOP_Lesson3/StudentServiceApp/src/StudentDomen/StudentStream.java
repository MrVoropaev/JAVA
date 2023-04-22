package StudentDomen;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentStream implements Iterable<StudentGroup> {

    private int streamNumber;
    private List<StudentGroup> groups;

    public StudentStream(int streamNumber, List<StudentGroup> listGroups) {
        this.streamNumber = streamNumber;
        groups = new ArrayList<>();
    }

    public void addGroup(StudentGroup group) {
        groups.add(group);
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return groups.iterator();
    }

    public int getStreamNumber() {
        return streamNumber;
    }

}