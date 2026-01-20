import java.util.ArrayList;

public class StudentManager {

    ArrayList<Student> students = new ArrayList<>();

    void addStudent(Student s) {
        students.add(s);
        System.out.println("Student Added Successfully");
    }

    void viewStudents() {
        if (students.size() == 0) {
            System.out.println("No students available");
        } else {
            for (Student s : students) {
                s.display();
            }
        }
    }

    void searchStudent(int id) {
        for (Student s : students) {
            if (s.id == id) {
                s.display();
                return;
            }
        }
        System.out.println("Student not found");
    }

    void deleteStudent(int id) {
        for (Student s : students) {
            if (s.id == id) {
                students.remove(s);
                System.out.println("Student deleted");
                return;
            }
        }
        System.out.println("Student not found");
    }
}
