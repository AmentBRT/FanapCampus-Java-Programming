public class App {
    public static void main(String[] args) throws Exception {
        Book book = new Book("ShahName", "Ferdosi");
        System.out.println(book);

        Student student = new Student(12, 12);
        System.out.println(student.getGrade());
        student.setGrade(11);
        System.out.println(student.getGrade());

        Animal jack = new Animal("Jack", 10);
        System.out.println(jack);
        jack.walk();
        Dog jack_2 = new Dog("Jack", 10);
        System.out.println(jack_2);
        jack_2.walk();
        jack_2.bark();

        Bird jason = new Bird("Jason", 14);
        System.out.println(jason);
        jason.sound();
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

class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void walk() {
        System.out.println("Walking...");
    }

    @Override
    public String toString() {
        return "Name: " + this.name + " Age: " + this.age;
    }
}

class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }

    public void bark() {
        System.out.println("Bark...");
    }

    @Override
    public String toString() {
        return "Type: Dog " + super.toString();
    }
}

class Bird extends Animal {
    public Bird(String name, int age) {
        super(name, age);
    }

    public void sound() {
        System.out.println("Make a sound...");
    }
}
