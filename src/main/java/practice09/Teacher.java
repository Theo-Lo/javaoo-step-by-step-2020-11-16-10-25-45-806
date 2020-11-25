package practice09;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Teacher extends Person {
    private Klass klass;
    private List<Klass> classes;
    public Teacher(int id, String name, int age, List<Klass> classes) {
        super(id, name, age);
        this.classes = classes;
    }
    public Teacher(int id, String name, int age) {
        super(id, name, age);
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

    public String introduceWith(Student student) {
        if(isTeaching(student)){
            return  getIntroduce()+student.getName()+".";
        }else{
            return  super.introduce()+" I am a Teacher. I don't teach "+student.getName()+".";
        }

    }

    public boolean isTeaching(Student student) {
        boolean isInTeacherClasses = getClasses().stream()
                                                 .map(Klass::getNumber)
                                                 .anyMatch(classNumber->classNumber.equals(student.getKlass().getNumber()));
        return isInTeacherClasses;
    }

    public List<Klass> getClasses() {
        return classes;
    }
}
