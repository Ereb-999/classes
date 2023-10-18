public class Book {
    private String bookName;
    private int age;
    private Author author;
    public Book(String bookName, int age) {
        this.bookName = bookName;
        this.age = age;
        this.author = getAuthor();
    }
    public String getBookName(){
        return this.bookName;
    }
    public int getAge(){
        return this.age;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAge (int age) {
        this.age = age;
    }


}
