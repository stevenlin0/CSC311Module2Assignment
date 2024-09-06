import java.util.Scanner;

/**
 * @author MoaathAlrajab
 */
public class StudentLst {

    public static void main(String[] args) {
        Student[] students = new Student[2];
        Scanner inScanner = new Scanner(System.in);

        for(int i = 0; i < students.length; i++) {
            System.out.print("Enter student's name: ");
            String name = inScanner.nextLine().trim();
            Student student = new Student(name);

            students[i] = student;
        }
        System.out.println(printOutput(students));
    }

    // Method to create a list of student names
    public static String printOutput(Student[] students) {
        // Use a stringbuilder for the output string
        StringBuilder sb = new StringBuilder();
        // Loop through each student and add their name to the output
        for (Student student : students) {
            sb.append("The student's name is ").append(student.getName()).append("\n");
        }
        return sb.toString();
    }
}