package Service;

import exception.ArrayFullException;
import exception.InvalidInputException;
import exception.StudentNotFoundException;
import model.Student;

public class StudentServiceImpl implements StudentService {

    private Student[] students = new Student[100];
    private int count = 0;
    //override addMethod
    @Override
    public void addStudent(Student student)
            throws ArrayFullException, InvalidInputException {

        if (count >= students.length) {
            throw new ArrayFullException("Student limit reached");
        }

        if (student.getAge() <= 0) {
            throw new InvalidInputException("Age must be positive");
        }

        if (student.getMarks() < 0 || student.getMarks() > 100) {
            throw new InvalidInputException("Marks must be between 0 and 100");
        }

        students[count++] = student;
        System.out.println("Student added successfully");
    }
    //Override view method from StudentService interface
    @Override
    public void viewAllStudent() throws StudentNotFoundException {
        if (count == 0) {
            throw new StudentNotFoundException("No students available");
        }

        for (int i = 0; i < count; i++) {
            students[i].display();
        }
    }
    //Override search method from StudentService interface
    @Override
    public Student searchStudent(String name) throws StudentNotFoundException {
        for (int i = 0; i < count; i++) {
            if (students[i].getName().equalsIgnoreCase(name)) {
                return students[i];
            }
        }
        throw new StudentNotFoundException("Student not found with name: " + name);
    }


    //Override update method from StudentService interface
    @Override
    public void updateStudent(String name, Student updatedStudent)
            throws StudentNotFoundException {

        Student existingStudent = searchStudent(name);

        existingStudent.setAge(updatedStudent.getAge());
        existingStudent.setCourse(updatedStudent.getCourse());
        existingStudent.setMarks(updatedStudent.getMarks());

        System.out.println("Student updated successfully (name unchanged)");
    }

    //Override delete method from StudentService interface
    @Override
    public void deleteStudent(int id) throws StudentNotFoundException {

        for (int i = 0; i < count; i++) {
            if (students[i].getStudentId() == id) {
                students[i] = students[count - 1];
                students[count - 1] = null;
                count--;
                System.out.println("Student deleted successfully");
                return;
            }
        }
        throw new StudentNotFoundException("Student ID not found");
    }
}
