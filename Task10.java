package Fast;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentRecord record = new StudentRecord();
        while (true) {
            System.out.println("\nStudent Record Management System");
            System.out.println("1. Enroll Student");
            System.out.println("2. Update Student Name");
            System.out.println("3. Withdraw Student");
            System.out.println("4. Display Enrolled Students");
            System.out.println("5. Exit");
            System.out.print("Please select an option: ");
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    System.out.print("Enter student's name to enroll: ");
                    String nameToEnroll = scanner.nextLine();
                    record.enrollStudent(nameToEnroll);
                    break;
                case 2:
                    System.out.print("Enter current student's name: ");
                    String oldName = scanner.nextLine();
                    System.out.print("Enter the new name: ");
                    String newName = scanner.nextLine();
                    record.updateStudentName(oldName, newName);
                    break;
                case 3:
                    System.out.print("Enter student's name to withdraw: ");
                    String nameToWithdraw = scanner.nextLine();
                    record.withdrawStudent(nameToWithdraw);
                    break;
                case 4:
                    record.displayEnrolledStudents();
                    break;
                case 5:
                    // Exit the program
                    System.out.println("Exiting the system.");
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
package Fast;
import java.util.ArrayList;
public class StudentRecord {
    private ArrayList<String> enrolledStudents;
    public StudentRecord() {
        enrolledStudents = new ArrayList<>();
    }
    public void enrollStudent(String studentName) {
        enrolledStudents.add(studentName);
        System.out.println(studentName +" has been enrolled successfully.");
    }
    public void updateStudentName(String oldName, String newName) {
        if (enrolledStudents.contains(oldName)) {
            int index = enrolledStudents.indexOf(oldName);
            enrolledStudents.set(index, newName);
            System.out.println("Student name updated from " + oldName + " to " + newName + ".");
        } else {
            System.out.println("Student " + oldName + " not found in the record.");
        }
    }
    public void withdrawStudent(String studentName) {
        if (enrolledStudents.contains(studentName)) {
            enrolledStudents.remove(studentName);
            System.out.println(studentName + " has been removed from the course.");
        } else {
            System.out.println("Student " + studentName + " not found in the record.");
        }
    }
    public void displayEnrolledStudents() {
        if (enrolledStudents.isEmpty()) {
            System.out.println("No students are currently enrolled.");
        } else {
            System.out.println("List of Enrolled Students:");
            for (String student : enrolledStudents) {
                System.out.println("- " + student);
            }
        }
    }
}
