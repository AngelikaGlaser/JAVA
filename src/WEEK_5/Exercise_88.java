package WEEK_5;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercise_88 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> studentList = new ArrayList<>();

        while (true) {
            System.out.print("name: ");
            String name = scanner.nextLine();

            if (name.isEmpty()) {
                break;
            }

            System.out.print("student-number: ");
            String studentNumber = scanner.nextLine();

            Student student = new Student(name, studentNumber);
            studentList.add(student);
        }

        System.out.println("\nList of students:");
        for (Student student : studentList) {
            System.out.println(student);
        }

        System.out.print("\nGive search term: ");
        String searchTerm = scanner.nextLine();
        System.out.println("Result:");

        for (Student student : studentList) {
            if (student.getName().contains(searchTerm)) {
                System.out.println(student);
            }
        }
    }
}