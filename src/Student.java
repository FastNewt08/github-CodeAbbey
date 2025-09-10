
public class Student {
    private String name;
    private int age;
    private String studentID;
    private double gpa;
    private static int studentCount = 0;

    Student(String name, int age, String studentID, double gpa){
        this.name = name;
        this.age = age;
        this.studentID = studentID;
        this.gpa = gpa;
        studentCount++;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Invalid");
        }
    }
    public String getStudentID() {
        return studentID;
    }
    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }
    public double getGpa() {
        return gpa;
    }
    public void setGpa(double gpa) {
        if (gpa >= 65 && gpa <=100) {
            this.gpa = gpa;
        } else {
            System.out.println("Invalid");
        }
    }
    public static int getStudentCount() {
        return studentCount;
    }
//    public static void setStudentCount(int studentCount) {
//        Student.studentCount = studentCount;
//    }
    public void study(){
        System.out.println(this.name + " is studying");
    }
    public void displayInfo(){
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Student ID: " + this.studentID);
        System.out.println("GPA: " + this.gpa);
    }
}
