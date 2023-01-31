package Class17;

public class BookHW {

    String name;
    String author;
    int year;
    int page;

    BookHW(String name2,String author2, int year2, int page2){
        name=name2;
        author=author2;
        year=year2;
        page=page2;
    }
    BookHW(String name2, int year2, String author2, int page2){
        name=name2;
        author=author2;
        year=year2;
        page=page2;
    }
    void print(){
        System.out.println("Name of the book: "+name+", Author of the book: "+author+", Publication year: "+year+", Page count: "+page);
    }

}
