package tasks;

import java.util.Scanner;

public class checkNameAndPassword {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String password = scanner.nextLine();

        if (password.length() < 8 || password.length() > 15) {
            while (password.length() < 8 || password.length() > 15) {
                System.out.println("Password incorrect, it's must be higher 8 and lower 15");
                password = scanner.nextLine();
            } if (password.length() > 8 || password.length() < 15) {
                System.out.printf("%s, %s", name, password);
            }
        } else {
            System.out.printf("%s, %s", name, password);
        }
    }
}
