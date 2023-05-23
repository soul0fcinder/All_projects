package FirstTries;

import java.util.Scanner;

public class Calculator2 {
    public static void main(String[] args) {

        System.out.println("Инструкция: \n 1) Операнды и операции писать на разных строчках \n 2) После сброса начинать с цифры \n 3) Сброс и закрытие строго латинскими буквами (C - сброс, s - закрытие)");

        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt(); // считывает число
        char operation = scanner.next().charAt(0); // считывает операцию
        int num2 = scanner.nextInt(); // второе число
        int result = 0;

        // получения первого результата
        if (operation == '+') {
            result = num1 + num2;
        } else if (operation == '-') {
            result = num1 - num2;
        } else if (operation == '*') {
            result = num1 * num2;
        } else if (operation == '/') {
            result = num1 / num2;
        } else {
            System.out.println("Error symbol/Ошибка символа");
        }

        System.out.println(result);

        // использование результата для "бесконечного" калькулятора
        while (true) {
            char operation1 = scanner.next().charAt(0);
            int num3 = scanner.nextInt(); // новое число для пред. результата

            if (operation1 == '+') {
                result = result + num3;
            } else if (operation1 == '-') {
                result = result - num3;
            } else if (operation1 == '*') {
                result = result * num3;
            } else if (operation1 == '/') {
                result = result / num3;
            } else if (operation1 == 'C') {  // реализация сброса данных
                result = num3;
            } else if (operation1 == 's') {  // выход из программы
                System.exit(0);
            } else {
                System.out.println("Error symbol/Ошибка символа");
            }

            System.out.println(result);
        }
    }
}
