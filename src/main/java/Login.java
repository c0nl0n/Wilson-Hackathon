public class Login {
    public static CurrentUser user;

    //login returns 2 if a teacher successfully logs in, returns 1 if a student successfully logs in, returns 0 if the login is unsuccessful
    public static int login(boolean isTeacher, String name, String password) {
        if (isTeacher) {
            for (int i = 0; i < Teacher.teachersList.size(); i++) {
                if (Teacher.teachersList.get(i).getName().toLowerCase().equals(name.toLowerCase()) && Teacher.teachersList.get(i).getPassword().equals(password)) {
                    user = new CurrentUser(Teacher.teachersList.get(i));
                    return 2;
                }
            }
        }
        if (!isTeacher) {
            for (int i = 0; i < Student.studentsList.size(); i++) {
                if (Student.studentsList.get(i).getName().toLowerCase().equals(name.toLowerCase()) && Student.studentsList.get(i).getPassword().equals(password)) {
                    user = new CurrentUser(Student.studentsList.get(i));
                    return 1;
                }
            }
        }
        return 0;
    }

    public static Teacher getCurrentTeacher() {
        return user.getCurrentTeacher();
    }
    public static Student getCurrentStudent() {
        return user.getCurrentStudent();
    }

    

}