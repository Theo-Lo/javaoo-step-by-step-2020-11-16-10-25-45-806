package practice10;


public class Klass {
    private Integer number;
    private Student leader;
    private Student member;
    private String displayName;

    public Klass(int number){
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public String getDisplayName() {
        return "Class " + number;
    }

    public void assignLeader(Student leader) {
        if(leader.getKlass().getNumber() == number){
            System.out.print("I am Tom. I know "+leader.getName()+" become Leader of "+leader.getKlass().getDisplayName()+".\n");
            this.leader = leader;
        }
        else{
            System.out.print("It is not one of us.\n");
        }
    }

    public Student getLeader() {
        return leader;
    }

    public void appendMember(Student student) {
        if(getLeader() == null){
            System.out.print("I am Tom. I know "+student.getName()+" has joined "+getDisplayName()+".\n");
        }else{
            System.out.print("I am "+leader.getName()+". I know "+student.getName()+" has joined "+getDisplayName()+".\n");
        }
        student.getKlass().number = number;
    }
}
