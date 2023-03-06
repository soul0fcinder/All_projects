import java.util.Scanner;

public class Calculator {
    public static void main (String[] args) {
        // калькулятор с возможностью выбора операции
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите 1 число: ");
        float num1 = sc.nextInt();

        System.out.print("Операция: ");
        String action = sc.nextLine();
        action = sc.nextLine();

        System.out.print("Введите 2 число: ");
        float num2 = sc.nextInt();

        switch (action) {
            case "+":
                float res1 = num1 + num2;
                System.out.print("Ответ: " + res1);
                break;
            case "-":
                float res2 = num1 - num2;
                System.out.print("Ответ: " + res2);
                break;
            case "*":
                float res3 = num1 * num2;
                System.out.print("Ответ: " + res3);
                break;
            case "/":
                if(num2 == 0)
                    System.out.print("Ошибка");
                else {
                    float res4 = num1 / num2;
                    System.out.print("Ответ: " + res4);
                }
                break;
            default:
                System.out.println("Неправильная операция");
        }
    }
}
