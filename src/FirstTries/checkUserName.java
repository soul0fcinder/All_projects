package FirstTries;

import java.util.Scanner;

public class checkUserName {
    public void check() {
        Scanner scanner = new Scanner(System.in);
        String a = "Vladimir";
        String b = scanner.nextLine();

        if (a.equalsIgnoreCase(b)) {
            System.out.println("Choose another name");
        } else {
            if (b.contains(" ")) {
                //b.replace(' ', '\0');
                System.out.println("Your name without spaces " + b.replaceAll(" ", ""));
                System.out.println(b.length());
                System.exit(0);
            }
            System.out.println("Good name!");
            System.out.println("Your name has length " + b.length());
        }
    }
}
