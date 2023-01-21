package Class10.GroupProject;

public class Project11 {
    public static void main(String[] args) {

        String[] dup={"tiger","lion","wolf","frog","dog","cat","fox","lion","wolf"};
        for (int i = 0; i < dup.length; i++) {
            for (int j = i+ 1; j < dup.length; j++) {
                if(dup[j].equals(dup[i])){
                    System.out.println(dup[j]);
                }

            }

        }
    }
}
