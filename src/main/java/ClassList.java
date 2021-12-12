import java.util.ArrayList;

public class ClassList {
    private ArrayList<Student> names = new ArrayList<Student>();
    private Teacher teacher;

    public ClassList(Teacher teacher) {
        this.teacher = teacher;
        teacher.addClass(this);
    }

    //adds a student to this class
    public void addStudent(Student student) {
        names.add(student);
    }

    //removes a student from this class
    public void removeStudent(String name) {
        for (int i = 0; i < names.size(); i++) {
            if (names.get(i).getName().toLowerCase().equals(name.toLowerCase())) {
                names.remove(i);
            }
        }
    }

    //returns the teacher of this class
    public Teacher getTeacher() {
        return teacher;
    }

    public String toString() {
        String result = "Teacher: " + teacher + "\n";
        for (int i = 0; i < names.size(); i++) {
            result += names.get(i);
            if (i != names.size() - 1) {
                result += ", ";
            }
        }
        return result;
    }

    //checks if this class contains a specific student
    public boolean contains(Student student) {
        for (int i = 0; i < names.size(); i++) {
            if (names.get(i).getName().toLowerCase().equals(student.getName().toLowerCase())) {
                return true;
            }
        }
        return false;
    }
    
}
