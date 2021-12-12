import java.util.ArrayList;

public class Teacher {
    private String name;
    private ArrayList<ClassList> classes = new ArrayList<ClassList>();
    private String password;
    public static ArrayList<Teacher> teachersList = new ArrayList<Teacher>();

    public Teacher(String name, String password) {
        this.password = password;
        this.name = name;
        teachersList.add(this);
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return name;
    }

    public void addClass(ClassList studentList) {
        classes.add(studentList);
    }

    //returns whether or not the teacher has a specific student
    public boolean has(Student student) {
        for (int i = 0; i < classes.size(); i++) {
            if (classes.get(i).contains(student)) {
                return true;
            }
        }
        return false;
    }

    public static Teacher find(String name) {
        for (int i = 0; i < teachersList.size(); i++) {
            if (teachersList.get(i).getName().toLowerCase().equals(name.toLowerCase())) {
                return teachersList.get(i);
            }
        }
        return null;
    }
}
