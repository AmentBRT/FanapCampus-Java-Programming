public class App {
    public static void main(String[] args) throws Exception {
        Book book = new Book("ShahName", "Ferdosi");
        System.out.println(book);

        Student student = new Student(12, 12);
        System.out.println(student.getGrade());
        student.setGrade(11);
        System.out.println(student.getGrade());
    }
}

class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book " + this.title + " by " + this.author;
    }
}

class Student {
    private int studentId;
    private int grade;

    public Student(int studentId, int grade) {
        this.studentId = studentId;
        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }
    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getStudentId() {
        return studentId;
    }
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
}
