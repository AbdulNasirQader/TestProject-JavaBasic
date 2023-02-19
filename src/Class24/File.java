package Class24;

public abstract class File {
    /*
    Create a class File that will have the following behaviors: open, edit, close.
    Edit and close are implemented method while open is an abstract.
    Create 3 subclasses: JavaFile, WordFile, PdfFile that will provide specific implementation of open behaviour:
    Example: to open .java file we need notepad++ or sublime text,
     to open .doc file we need Microsoft word to be installed etc
     */
    int size;
    File(int size){
        this.size=size;
    }
    abstract void open();
    void edit(){
        System.out.println("editing the file");
    }
    void close(){
        System.out.println("Closing the file");
    }
}
class JavaFile extends File{
    JavaFile(int size){
        super(size);
    }
    @Override
    void open() {
        System.out.println("Opening the file in intellij");
    }

    @Override
    void edit() {
        System.out.println("Editing the file in intellij");
    }
}
class WordFile extends File{

    WordFile(int size){
        super(size);
    }
    @Override
    void open() {
        System.out.println("Opening the file in Microsoft word");
    }
}
class PDFFile extends File{
    PDFFile(int size){
        super(size);
    }
    @Override
    void open() {
        System.out.println("Opening the file in Adobe reader");
    }
}
