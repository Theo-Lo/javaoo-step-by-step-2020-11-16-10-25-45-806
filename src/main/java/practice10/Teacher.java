package practice10;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Teacher extends Person {
    private Klass klass;
    private List<Klass> classes;
    public Teacher(int id, String name, int age, List<Klass> classes) {
        super(id, name, age);
        this.classes = classes;

        for (Klass klass : classes) {
            klass.setTeacher(this);
        }
    }
    public Teacher(int id, String name, int age) {
        super(id, name, age);
        this.classes = new LinkedList<>();
    }

    public Klass getKlass() {
        return klass;
    }

    public String introduce() {
        if(classes==null){
            return getIntroduce()+"No Class.";
        }
        if(getClasses().size()!=0){
            String teachingClasses = getClasses().stream()
                    .map(Klass::getNumber)
                    .map(String::valueOf)
                    .collect(Collectors.joining(", "));
            return  getIntroduce() +"Class "+teachingClasses+".";
        }
        return getIntroduce()+"No Class.";
    }

    private String getIntroduce() {
        return super.introduce()+" I am a Teacher. I teach ";
    }

    // remove else
    public String introduceWith(Student student) {
        if(isTeaching(student)){
            return  getIntroduce()+student.getName()+".";
        }
        return  super.introduce()+" I am a Teacher. I don't teach "+student.getName()+".";

    }


    //use back isIn
    public boolean isTeaching(Student student) {
        for (Klass klass : getClasses()) {
            if (klass.isIn(student)) return true;
        }
        return false;
    }

    public void notifyJoinClass(Klass klass, Student student) {
        System.out.print("I am " + getName() + ". I know " + student.getName() + " has joined " + klass.getDisplayName() + ".\n");
    }

    public void notifyBecomeMonitor(Klass klass, Student student) {
        System.out.print("I am " + getName() + ". I know " + student.getName() + " become Leader of " + klass.getDisplayName() + ".\n");
    }

    public List<Klass> getClasses() {
        return classes;
    }
}
