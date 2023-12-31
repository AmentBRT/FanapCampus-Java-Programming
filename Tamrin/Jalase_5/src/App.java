public class App {
    public static void main(String[] args) throws Exception {
        Book book = new Book("ShahName", "Ferdosi");
        System.out.println(book);
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
