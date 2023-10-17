public class Book {
    private String bookName;
    private int age;
    public Book(String bookName, int age) {
        this.bookName = bookName;
        this.age = age;
    }
    public String getBookName(){
        return this.bookName;
    }
    public int getAge(){
        return this.age;
    }

    public void setAge (int age) {
        this.age = age;
    }
}
