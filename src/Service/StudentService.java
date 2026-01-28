package Service;

import exception.ArrayFullException;
import exception.InputMismatchException;
import exception.InvalidInputException;
import exception.StudentNotFoundException;
import model.Student;

public interface StudentService {

    void addStudent(Student student)
            throws ArrayFullException, InvalidInputException, InputMismatchException;

    void viewAllStudent() throws StudentNotFoundException,InputMismatchException;

    Student searchStudent(String name) throws StudentNotFoundException;

    void updateStudent(String name, Student updatedStudent)
            throws StudentNotFoundException;

    void deleteStudent(int id) throws StudentNotFoundException;
}
