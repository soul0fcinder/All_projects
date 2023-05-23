package FirstTries;

public class Loader2 {
    public static void main(String[] args) {
        int i = 10;
        do {
            --i;
            if (i == 1) {
                continue;
            }
            System.out.println("Value i = " + i);
        } while (i > 1);
    }
}