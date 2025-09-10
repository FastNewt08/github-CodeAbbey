import java.util.Scanner;
public class StudentManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student [] students = new Student[10];
        int count = 0;

        while (true){
            System.out.println("=== Student Management System ===");
            System.out.println("A. Add Student");
            System.out.println("B. Remove Student");
            System.out.println("C. Display Student");
            System.out.println("D. Exit");
            System.out.println("Choose an option: ");
            char option = sc.next().charAt(0);

            if (option == 'A' || option == 'a'){
                if (count >= students.length){
                    System.out.println("Cannot add student. Array is full.");
                } else {
                    System.out.println("Add new Student");
                    System.out.print("Name: ");
                    String name = sc.next();
                    System.out.print("Age: ");
                    int age = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Student ID: ");
                    String studentID = sc.nextLine();
                    System.out.print("GPA: ");
                    int gpa = sc.nextInt();
                    sc.nextLine();

                    students[count]= new Student(name, age, studentID, gpa);
                    count++;
                    System.out.println("Student added successfully.");
                }
            } else if (option == 'B' || option == 'b'){
                if (count == 0){
                    System.out.println("Array is Empty.");
                } else {
                    System.out.println("Remove Student");
                    System.out.println("Enter Student ID to remove:");
                    String studentID = sc.next();
                    boolean found = false;

                for (int i = 0; i < count; i++) {
                    if (students[i].getStudentID().equals(studentID)) {
                        found = true;
                        for (int j = i; j < count - 1; j++) {
                            students[j] = students[j + 1];
                        }
                        students[count - 1] = null;
                        count--;
                        System.out.println("Student with ID " + studentID + " removed.");
                    }
                }
                if (!found){
                    System.out.println("Student not found.");
                    }
                }
            } else if (option == 'C' || option == 'c') {
                if (count == 0){
                    System.out.println("Array is Empty");
                } else {
                    for (int i = 0; i < count; i++){
                        students[i].displayInfo();
                    }
                    System.out.println("Total Student count: " + Student.getStudentCount());
                }
            } else if (option == 'D' || option == 'd'){
                System.out.println("Exiting the System.");
                break;
            } else {
                System.out.println("Invalid choice.");
            }
        }
    }
}
