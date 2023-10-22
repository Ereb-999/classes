import java.util.Objects;

public class Book {
    private final String bookName;
    private int age;
    private final Author author;
    public Book(String bookName, int age, Author author) {
        this.bookName = bookName;
        this.age = age;
        this.author = author;
    }
    public String getBookName(){
        return this.bookName;
    }
    public int getAge(){
        return this.age;
    }

    public Author getAuthor() {
        return this.author;
    }

    public void setAge (int age) {
        this.age = age;
    }
    @Override
    public String toString(){
        return "Книга " + bookName + ". Опубликованая " + age + " год, авторство " + author + ".";
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass()) return false;
        Book book = (Book) obj;
        return age == book.age && Objects.equals(bookName, book.bookName) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName, age);
    }
}

