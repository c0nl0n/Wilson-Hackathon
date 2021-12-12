import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<ClassList> classes = new ArrayList<ClassList>();
    private String password;
    public static ArrayList<Student> studentsList = new ArrayList<Student>();


    public Student(String name, ClassList className, String password) {
        classes.add(className);
        this.name = name;
        this.password = password;
        className.addStudent(this);
        studentsList.add(this);
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String toString() {
        return name;
    }

    //returns whether or not the student has a specific class
    public boolean has(ClassList doTheyHaveIt) {
        if (doTheyHaveIt.contains(this)) {
            return true;
        } else {
            return false;
        }
    }

    //returns whether or not the student has a specific teacher
    public boolean has(Teacher teacher) {
        if (teacher.has(this)) {
            return true;
        } else {
            return false;
        }
    }
}
