package Class33;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class HW2_ListOf_24_Exepctions {
    public static void main(String[] args) {

        List<Exception> exceptionList = createExceptionList();

        for (Exception e : exceptionList) {
            System.out.println("Exception name: " + e.getClass().getSimpleName());
            System.out.println("Exception details: " + e.getMessage());
            System.out.println("------------------------------");
        }
    }

    public static List<Exception> createExceptionList() {
        List<Exception> exceptions = new ArrayList<>();

        // 1. ArithmeticException
        try {
            int i = 1 / 0; // Division by zero
        } catch (ArithmeticException e) {
            exceptions.add(e);
        }
        // 2. ArrayIndexOutOfBoundsException
        try {
            int[] arr = new int[3];
            arr[4] = 5; // Index out of bounds
        } catch (ArrayIndexOutOfBoundsException e) {
            exceptions.add(e);
        }
        // 3. IndexOutOfBoundsException
        try {
            List<Integer> list = new ArrayList<>();
            list.get(1); // Index out of bounds
        } catch (IndexOutOfBoundsException e) {
            exceptions.add(e);
        }
        // 4. NegativeArraySizeException
        try {
            int[] arr = new int[-3]; // Negative array size
        } catch (NegativeArraySizeException e) {
            exceptions.add(e);
        }
        // 5. NullPointerException
        try {
            String s = null;
            s.length(); // Attempt to call method on null reference
        } catch (NullPointerException e) {
            exceptions.add(e);
        }
        // 6. NumberFormatException
        try {
            int i = Integer.parseInt("abc"); // Invalid format for integer
        } catch (NumberFormatException e) {
            exceptions.add(e);
        }
        // 7. StringIndexOutOfBoundsException
        try {
            String s = "hello";
            char c = s.charAt(10); // Index out of bounds
        } catch (StringIndexOutOfBoundsException e) {
            exceptions.add(e);
        }
        // 8. FileNotFoundException
        try {
            FileInputStream fis = new FileInputStream("file.txt"); // Attempt to open non-existent file
        } catch (FileNotFoundException e) {
            exceptions.add(e);
        }
        // 9. NoSuchElementException
        try {
            List<Integer> list = new ArrayList<>();
            Iterator<Integer> iter = list.iterator();
            iter.next(); // No more elements in iteration
        } catch (NoSuchElementException e) {
            exceptions.add(e);
        }
        // 8. IOException
        try {
            URL url = new URL("http://www.google.com");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("INVALID_METHOD"); // Invalid HTTP request method
            conn.connect();
            int responseCode = conn.getResponseCode(); // Exception thrown during HTTP request
        } catch (IOException e) {
            exceptions.add(e);
        }
        // 9. InterruptedException
        try {
            Thread.sleep(10000); // Interrupted while sleeping
        } catch (InterruptedException e) {
            exceptions.add(e);
        }
        // 10. RuntimeException
        try {
            throw new RuntimeException("This is a runtime exception"); // Generic runtime exception
        } catch (RuntimeException e) {
            exceptions.add(e);
        }

        // 11. ArrayStoreException
        try {
            Object[] arr = new String[3];
            arr[0] = Integer.valueOf(42); // Incompatible type assignment
        } catch (ArrayStoreException e) {
            exceptions.add(e);
        }
        // 12. ClassCastException
        try {
            Object x = new Integer(0);
            System.out.println((String) x); // Attempt to cast incompatible type
        } catch (ClassCastException e) {
            exceptions.add(e);
        }
        // 13. IllegalArgumentException
        try {
            throw new IllegalArgumentException("Invalid argument"); // Explicitly thrown
        } catch (IllegalArgumentException e) {
            exceptions.add(e);
        }
        // 14. IllegalMonitorStateException
        try {
            Object o = new Object();
            o.wait(); // Call to wait() on object not in synchronized block
        } catch (IllegalMonitorStateException e) {
            exceptions.add(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        // 15. IllegalStateException
        try {
            throw new IllegalStateException("Invalid state"); // Explicitly thrown
        } catch (IllegalStateException e) {
            exceptions.add(e);
        }
        // 16. IllegalThreadStateException
        try {
            Thread t = new Thread();
            t.start();
            t.start(); // Attempt to start thread twice
        } catch (IllegalThreadStateException e) {
            exceptions.add(e);
        }
        // 17. SecurityException
        try {
            System.setProperty("java.io.tmpdir", "/path/to/unauthorized/folder"); // Attempt to set system property without permission
        } catch (SecurityException e) {
            exceptions.add(e);
        }
        // 18. ConcurrentModificationException
        try {
            List<Integer> list = new ArrayList<>();
            list.add(1);
            for (Integer i : list) {
                list.remove(i); // Attempt to modify list while iterating over it
            }
        } catch (ConcurrentModificationException e) {
            exceptions.add(e);
        }
        // 19. EmptyStackException
        try {
            Stack<String> stack = new Stack<>();
            stack.pop(); // Attempt to pop element from an empty stack
        } catch (EmptyStackException e) {
            exceptions.add(e);
        }
        // 20. NoSuchFieldException
        try {
            Class<?> clazz = String.class;
            Field field = clazz.getDeclaredField("invalidField"); // Attempt to access non-existent field
        } catch (NoSuchFieldException e) {
            exceptions.add(e);
        }
        // 21. NoSuchMethodException
        try {
            Class<?> clazz = String.class;
            Method method = clazz.getDeclaredMethod("invalidMethod"); // Attempt to access non-existent method
        } catch (NoSuchMethodException e) {
            exceptions.add(e);
        }
        // 22. ParseException
        try {
            DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
            Date date = df.parse("invalidDate"); // Invalid date string
        } catch (ParseException e) {
            exceptions.add(e);
        }
        // 23. UnsupportedEncodingException
        try {
            byte[] bytes = "hello".getBytes("invalidEncoding"); // Unsupported encoding name
        } catch (UnsupportedEncodingException e) {
            exceptions.add(e);
        }

        // 24. UnsupportedOperationExcepeption
        try {
            List<Integer> list = List.of(1, 2, 3);
            list.add(4); // Attempt to modify unmodifiable list
        } catch (UnsupportedOperationException e) {
            exceptions.add(e);
        }
        return exceptions;
    }

    /*    In this example, we have a static method named "createExceptionList" that
        creates objects of 24 exception classes using try and catch blocks.
        If an exception is thrown, we catch it and add it to a List of Exceptions. Finally,
        we return the List.
        In the main method, we call the createExceptionList method to get the list of exception
        objects, and then we iterate over the list and print the name and details of each exception object.*/

}

