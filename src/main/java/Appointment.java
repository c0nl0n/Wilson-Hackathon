import java.util.ArrayList;

public class Appointment {
    private String time;
    private int day;
    private String dayStr;
    private Student student;
    private boolean accepted;
    static ArrayList<Appointment> appointmentsList = new ArrayList<Appointment>();
    public final String[] DAYS = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
    private Teacher teacher;
    private boolean buildFail;

    public Appointment(String startTime, int day, Student student, Teacher teacher) {
        //tests whether the student has the teacher or not
        if (!student.has(teacher)) {
            System.out.println("You do not have this teacher");
            buildFail = true;
            return;
        }
        dayStr = DAYS[day];
        this.teacher = teacher;
        time = startTime;
        this.day = day;
        this.student = student;
        accepted = false;
        buildFail = false;
    }
    public String getInfo() {
        return ("Appointment with" + teacher.getName() + " at " + time + "on " + dayStr);
    }

    public String toString() {
        //if the student does not have the teacher they were trying to make an appointment with this is returned
        if (buildFail) {
            return("This appointment was not made");
        }
        return ("Appointment for " + student.getName() + " with " + teacher.getName() +  " at " + time + " on " + dayStr);
    }

    //for teacher to accept appointment
    public void accept() {
        accepted = true;
    }

    //changes day by x number of days (negative if you want the meeting sooner; positive if you want it later)
    public void changeDay(int dayChangeBy) {
        day += dayChangeBy;
        day %= 5;
    }
    public static void removeLast() {
        appointmentsList.remove(appointmentsList.size() - 1);
    }
    public static void appointmentQ(Appointment appointment) {
        appointmentsList.add(appointment);
    } 
    public static int appointmentLength() {
        return appointmentsList.size();
    }
    public static String getAppointmentToString(int index) {
        return appointmentsList.get(index).toString();
    }
    public static void removeCurrentAppointment(int index) {
        appointmentsList.remove(index);
    }
    
}
