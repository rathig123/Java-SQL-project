import java.util.Scanner;

public class Main {

    public static String calculateGrade(int marks) {
        if (marks >= 90) return "A";
        else if (marks >= 75) return "B";
        else if (marks >= 60) return "C";
        else if (marks >= 40) return "D";
        else return "F";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentDAO dao = new StudentDAO();

        while (true) {
            System.out.println("\n--- Student Management Menu ---");
            System.out.println("1. Add Student");
            System.out.println("2. Show All Students");
            System.out.println("3. Exit");
            System.out.print("Choose: ");
            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter name: ");
                String name = sc.next();

                System.out.print("Enter subject: ");
                String sub = sc.next();

                System.out.print("Enter marks: ");
                int marks = sc.nextInt();

                String grade = calculateGrade(marks);

                Student s = new Student(name, sub, marks, grade);
                dao.addStudent(s);

            } else if (choice == 2) {
                for (Student st : dao.getAllStudents()) {
                    System.out.println(
                            st.getId() + " | " +
                            st.getName() + " | " +
                            st.getSubject() + " | " +
                            st.getMarks() + " | " +
                            st.getGrade()
                    );
                }

            } else {
                System.out.println("Goodbye!");
                break;
            }
        }
        sc.close();
    }
}
