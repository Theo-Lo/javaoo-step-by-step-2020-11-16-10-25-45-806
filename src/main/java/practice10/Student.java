package practice10;

public class Student extends Person {
    private Klass klass;
    public Student(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
        this.klass.appendMember(this);
    }

    public Student(int id, String name, int age) {
        super(id, name, age);
    }
    public Klass getKlass() {
        return klass;
    }

    // use this.equals(klass.getLeader())
    public String introduce() {
        if(klass.getLeader()==null){
            return super.introduce()+" "+"I am a Student. I am at Class "+klass.getNumber()+".";
        }
        if(super.getName().equals(klass.getLeader().getName())){
            return super.introduce()+" "+"I am a Student. I am Leader of Class "+klass.getNumber()+".";
        }
        return super.introduce()+" I am a Student. I am at Class "+klass.getNumber()+".";
    }
}
