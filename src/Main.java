public class Main {
    public static void main(String[] args) {
        Author gov = new Author("Говард", "Лафкрафт");
        Author lev = new Author("Лев", "Толстой");
        Book necro = new Book("Некронамикон", 1938, gov);
        Book world = new Book("Война и мир", 1863, lev);
        System.out.println(gov);
        System.out.println(lev);
        System.out.println(necro);
        System.out.println(world);
        world.setAge(1870);
        System.out.println(world);
    }
}