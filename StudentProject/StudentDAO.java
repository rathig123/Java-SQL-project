import java.sql.*;
import java.util.ArrayList;

public class StudentDAO {

    public StudentDAO() {
        createTable();
    }

    // Create table if not exists
    private void createTable() {
        String sql = "CREATE TABLE IF NOT EXISTS students (" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                "name TEXT," +
                "subject TEXT," +
                "marks INTEGER," +
                "grade TEXT)";
        try (Connection conn = DBConnection.connect();
             Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // Insert student
    public void addStudent(Student s) {
        String sql = "INSERT INTO students(name, subject, marks, grade) VALUES(?, ?, ?, ?)";
        try (Connection conn = DBConnection.connect();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, s.getName());
            ps.setString(2, s.getSubject());
            ps.setInt(3, s.getMarks());
            ps.setString(4, s.getGrade());
            ps.executeUpdate();
            System.out.println("Student Added!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // Read all students
    public ArrayList<Student> getAllStudents() {
        String sql = "SELECT * FROM students";
        ArrayList<Student> list = new ArrayList<>();

        try (Connection conn = DBConnection.connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                list.add(new Student(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("subject"),
                        rs.getInt("marks"),
                        rs.getString("grade")
                ));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return list;
    }
}
