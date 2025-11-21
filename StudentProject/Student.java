public class Student {
    private int id;
    private String name;
    private String subject;
    private int marks;
    private String grade;

    public Student(String name, String subject, int marks, String grade) {
        this.name = name;
        this.subject = subject;
        this.marks = marks;
        this.grade = grade;
    }

    public Student(int id, String name, String subject, int marks, String grade) {
        this.id = id;
        this.name = name;
        this.subject = subject;
        this.marks = marks;
        this.grade = grade;
    }

    // Getters
    public int getId() { return id; }
    public String getName() { return name; }
    public String getSubject() { return subject; }
    public int getMarks() { return marks; }
    public String getGrade() { return grade; }
}
