public class Main {
    public static void main(String[] args) {
        Author gov = new Author("Говард", "Лафкрафт");
        Author lev = new Author("Лев", "Толстой");
       Book necro = new Book("Некронамикон", 1938, gov);
        Book world = new Book("Война и мир", 1863, lev);
       System.out.println("Книга: " + necro.getBookName());
        System.out.println("Автор: " + gov.getAuthorName() + " " + gov.getSurnameName());
       System.out.println("Год публикации: " + necro.getAge());
       System.out.println(" ");
        System.out.println("Книга: " + world.getBookName());
        System.out.println("Автор: " + lev.getAuthorName() + " " + lev.getSurnameName());
        System.out.println("Год публикации: " + world.getAge());
        System.out.println(" ");
        world.setAge(1870);
        System.out.println("Книга: " + world.getBookName());
        System.out.println("Автор: " + lev.getAuthorName() + " " + lev.getSurnameName());
        System.out.println("Год публикации: " + world.getAge());
    }
}