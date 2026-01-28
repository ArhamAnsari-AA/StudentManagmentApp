package Main;

import Service.StudentService;
import Service.StudentServiceImpl;
import exception.ArrayFullException;
import exception.InputMismatchException;
import exception.InvalidInputException;
import exception.StudentNotFoundException;
import model.Student;

import java.util.Scanner;

public class StudentManagementApp {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StudentService service = new StudentServiceImpl();
// from these user select the option i used switch case which is inside while loop
        while (true){

            System.out.println("\n Student Management System ");
            System.out.println("1. Add Student ");
            System.out.println("2. View Student");
            System.out.println("3. Search Student");
            System.out.println("4.Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");
            System.out.println(" Choose Option");

            try {
                int choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("Enter the StudentId");
                        int id = sc.nextInt();
                        sc.nextLine();

                        System.out.println("Enter the name ");
                        String name = sc.nextLine();

                        System.out.println("Enter the age");
                        int age = sc.nextInt();
                        sc.nextLine();

                        System.out.println("Enter the course");
                        String course = sc.nextLine();

                        System.out.println("Enter the marks");
                        double marks = sc.nextDouble();

                        service.addStudent(new Student(id, name, age, course, marks));
                        break;

                    case 2:
                        service.viewAllStudent();
                        break;

                    case 3:
                        sc.nextLine();

                        System.out.println("Enter the Student name");
                        String sname = sc.nextLine();

                        Student student = service.searchStudent(sname);
                        student.display();
                        break;

                    case 4:
                        sc.nextLine(); // buffer clear

                        System.out.println("Enter name of student to update");
                        String uname = sc.nextLine();

                        System.out.println("Enter new age");
                        int uage = sc.nextInt();
                        sc.nextLine();

                        System.out.println("Enter new course");
                        String ucourse = sc.nextLine();

                        System.out.println("Enter new marks");
                        double umarks = sc.nextDouble();

                        service.updateStudent(
                                uname,
                                new Student(0, null, uage, ucourse, umarks)
                        );
                        break;

                    case 5:
                        System.out.println("Enter Id to delete");
                        int d_id = sc.nextInt();
                        service.deleteStudent(d_id);
                        break;

                    case 6:
                        System.out.println("Exiting Application");
                        sc.close();
                        System.exit(0);

                    default:
                        System.out.println("Invalid choice!");
                }
            // InputMisMatch catch here
            } catch (InputMismatchException e) {
                System.out.println( " Invalid input type! Please enter correct data.");
                sc.nextLine(); // buffer clear

            } catch (ArrayFullException | StudentNotFoundException | InvalidInputException e) {
                System.out.println(" Error: " + e.getMessage());
            }












        }

    }
}
