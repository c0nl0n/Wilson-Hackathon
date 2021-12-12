import java.util.ArrayList;

public class officeHours {
    static String hours = "";
    public static void setHours(String start, String end) {
       hours = "Office hours go from " + start + " to " + end;
    }
    public static String getHours() {
        return hours;
    }
}
