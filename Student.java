import java.util.Objects;

public class Student {
    String name;
    int roll_no;
    public Student(String name,int roll_no)
    {
        this.name = name;
        this.roll_no = roll_no;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", roll_no=" + roll_no +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return roll_no == student.roll_no;
    }

    @Override
    public int hashCode() {
        return Objects.hash(roll_no);
    }
}

