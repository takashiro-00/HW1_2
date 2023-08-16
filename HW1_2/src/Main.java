import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    private static final ArrayList<Student> students = new ArrayList<>();
    public static void addStudent(String name, String gender, LocalDate dob) {
        try {
            Student student = new Student(name, gender, dob.getYear(), dob.getMonthValue(), dob.getDayOfMonth());
            students.add(student);
            System.out.println("Student added!");
        } catch (CommonException e) {
            System.out.println("Error: " + e.getErrorCode() + ", more info: " + e.getExtraInfo());
        }
    }

    public static void main(String[] args) {
        addStudent("Alice", "Female", LocalDate.of(2002,1,2));
        addStudent("Blake", "Male", LocalDate.of(2006,3,14));
        addStudent("Cindy", "Female", LocalDate.of(2007,5,26));
        addStudent("David", "Male", LocalDate.of(2000,7,8));
        addStudent("Erasmus", "Male", LocalDate.of(1997,9,20));
    }
}