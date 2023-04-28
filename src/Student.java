import java.io.Serializable;

public class Student implements Serializable {
    private int id;
    private String name;
    private String college;

    public Student(int id, String name, String college) {
        this.id = id;
        this.name = name;
        this.college = college;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", college='" + college + '\'' +
                '}';
    }
}
