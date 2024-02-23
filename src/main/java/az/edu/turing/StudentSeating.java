package az.edu.turing;
import java.util.Scanner;
public class StudentSeating {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter total number of rows: ");
            int rows = scanner.nextInt();

            System.out.print("Enter number of students per row: ");
            int studentsPerRow = scanner.nextInt();

            System.out.print("Enter student's roll number: ");
            int rollNumber = scanner.nextInt();

            int row = (rollNumber - 1) / studentsPerRow + 1;
            int seat = (rollNumber - 1) % studentsPerRow + 1;

            System.out.println("Student is in row " + row + ", seat " + seat);


    }
}
