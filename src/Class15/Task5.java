package Class15;

public class Task5 {

    Boolean number(int num) {
        boolean prime = true;
        if (num > 1) {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    return false;
                }
            }

        }
        return prime;
    }
}
