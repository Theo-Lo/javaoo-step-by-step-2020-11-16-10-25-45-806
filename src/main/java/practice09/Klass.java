package practice09;

public class Klass {
    private Integer number;
    private Student leader;
    private Student memeber;
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
            this.leader = leader;
        }
        else{
            System.out.print("It is not one of us.\n");
        }
    }

    public Student getLeader() {
        return leader;
    }

    public void appendMember(Student member) {
        this.memeber = member;
    }
}
