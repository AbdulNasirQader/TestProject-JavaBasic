package Class11;

public class Homework3 {
    public static void main(String[] args) {

        String[][] students = {{"Nigel", "Jeanny", "John", "Nat"},
                {"A", "C", "B", "F"}};
        for (int i = 0; i < students.length; i++) {
            for (int j = 0; j < students[i].length; j++) {
                if (students[i][j].equals("A") || students[i][j].equals("B")) {
                    System.out.println(students[0][j]);
                }
            }
            System.out.println("---------");
        }
    }}
