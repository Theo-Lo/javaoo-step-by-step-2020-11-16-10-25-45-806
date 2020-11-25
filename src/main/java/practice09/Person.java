package practice09;

public class Person {
    private String name;
    private int age;
    private int id;
    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getId(){
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String introduce() {
        return "My name is "+this.name+". I am "+this.age+" years old.";
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Person){
            return ((Person) obj).id == this.id;
        }
        return super.equals(obj);
    }
}