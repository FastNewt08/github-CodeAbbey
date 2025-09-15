
import java.util.Objects;
import java.util.Scanner;

public class StudentDemo {
    public static void main(String[] args) {
       Student s1 = new Student("Arel", 10, "0303", 32);

       s1.setStudentID("1200");
        System.out.println(s1.getStudentID());
       s1.displayInfo();
       s1.study();
        System.out.println(Student.getStudentCount());
    }
}
