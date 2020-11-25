package practice07;

import practice07.Klass;
import practice07.Person;
import practice07.Student;

public class Teacher extends Person {
    private Klass klass;
    public Teacher(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }
    public Teacher(int id, String name, int age) {
        super(id, name, age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    public String introduce() {
        if(klass==null){
            return super.introduce()+" I am a Teacher. I teach No Class.";
        }else{
            return  super.introduce()+" I am a Teacher. I teach Class "+klass.getNumber()+".";
        }
    }

    public String introduceWith(Student student) {
        if(student.getKlass()==klass){
            return  super.introduce()+" I am a Teacher. I teach "+student.getName()+".";
        }else{
            return  super.introduce()+" I am a Teacher. I don't teach "+student.getName()+".";
        }

    }
}
