package Class33;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionDemo4 {
    public static void main(String[] args) throws FileNotFoundException {

       // String path=null;
       // FileInputStream fileInputStream=new FileInputStream(path);

        String name="nasir";

        if (name.length()<8){
            throw new LazyException("Iam Lazy person");
        }
    }
}
