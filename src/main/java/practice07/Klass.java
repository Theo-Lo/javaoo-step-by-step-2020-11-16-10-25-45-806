package practice07;

public class Klass {
    private Integer number;
    private Student leader;
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
        this.leader = leader;
    }

    public Student getLeader() {
        return leader;
    }
}
