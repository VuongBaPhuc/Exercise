import java.util.ArrayList;

public class SchoolSystem {
    private Student[] students = new Student[10];
    private Lecturer[] lecturers = new Lecturer[10];
    private Project[] projects = new Project[10];
    private int studentCount = 0;
    private int lecturerCount = 0;
    private int projectCount = 0;

    public void addStudent(Student student) {
        if (studentCount < 10) {
            students[studentCount++] = student;
        } else {
            System.out.println("Student list is full.");
        }
    }

    public void addLecturer(Lecturer lecturer) {
        if (lecturerCount < 10) {
            lecturers[lecturerCount++] = lecturer;
        } else {
            System.out.println("Lecturer list is full.");
        }
    }

    public void addProject(Project project) {
        if (projectCount < 10) {
            projects[projectCount++] = project;
        } else {
            System.out.println("Project list is full.");
        }
    }

    public void displayAll() {
        System.out.println("Students:");
        for (int i = 0; i < studentCount; i++) {
            System.out.println(students[i]);
        }

        System.out.println("Lecturers:");
        for (int i = 0; i < lecturerCount; i++) {
            System.out.println(lecturers[i]);
        }

        System.out.println("Projects:");
        for (int i = 0; i < projectCount; i++) {
            System.out.println(projects[i]);
        }
    }
}
