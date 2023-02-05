package Class19;

public class Book {

    String name;

    String author;

    int year;

    Book(String name, String author){
        this.name= name;
        this.author= author;
    }

    Book(String name, String author, int year){
        this(name, author);
        this.year= year;
    }

    void info(){
        System.out.println("Book Name: "+name+" Author Name: "+author+" Year of Publishes: "+year);
    }

    public static void main(String[] args) {

        Book book=new Book("Judy Kerolus", "Java Priciples", 2023);
        book.info();
    }
}

