public class CurrentUser {
    private Teacher teacher;
    private Student student;
    private boolean isTeacher;

    public CurrentUser(Teacher teacher) {
        this.teacher = teacher;
        isTeacher = true;
    }

    public CurrentUser(Student student) {
        this.student = student;
        isTeacher = false;
    }

    public Teacher getCurrentTeacher() {
        return teacher;
    }

    public Student getCurrentStudent() {
        return student;
    }
}
