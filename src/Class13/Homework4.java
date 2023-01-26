package Class13;

public class Homework4 {
    public static void main(String[] args) {

        String input = "This is sentence i want to reverse";
        String[] words = input.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            sb.append(new StringBuilder(word).reverse().toString() + " ");
        }
        String output = sb.toString().trim();
        System.out.println(output);
    }

}
