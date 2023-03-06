package Student;

public class Student {
    //Constructor
    public Student() {
    }

    public Student(String name, String classes) {
        this.name = name;
        this.classes = classes;
    }

    //Property
    private String name = "John";
    private String classes = "CO2";
    //Method

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public String getClasses() {
        return classes;
    }
}
