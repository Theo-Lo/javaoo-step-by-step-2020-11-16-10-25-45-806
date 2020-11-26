package practice10;

import java.util.ArrayList;
import java.util.List;

//todo remove member
public class Klass {
    private Integer number;
    private Student leader;
    private Teacher teacher;
    private final List<Student> students = new ArrayList<>();

    public Klass(int number){
        this.number = number;
        teacher = null;
    }

    public int getNumber() {
        return number;
    }

    public String getDisplayName() {
        return "Class " + number;
    }

    // update Tom
    public void assignLeader(Student leader) {
        if (!isIn(leader)) {
            System.out.print("It is not one of us.\n");
            return;
        }
        this.leader = leader;
        if (getTeacher() != null){
            getTeacher().notifyBecomeMonitor(this, leader);
        }
    }

    public Student getLeader() {
        return leader;
    }

    public Teacher getTeacher() { return teacher;}

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }


    //update tom
    public void appendMember(Student student) {
        this.students.add(student);
        if (getTeacher() != null) getTeacher().notifyJoinClass(this, student);
    }

    public boolean isIn(Student student){
        return this.students.contains(student);
    }
}
