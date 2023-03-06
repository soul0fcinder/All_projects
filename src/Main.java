import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        // Массивы данных
        int[] arr = new int[6];
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < arr.length; i++) {
            System.out.print("Введите число: ");
            int value = sc.nextInt();
            arr[i] = value;
        }

        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max)
            max = arr[i];
        }
        System.out.println("Максимум: " + max);

        int[][] nums3 = new int[][] {
                {5, 6, 7},
                {10, 11, 12},
                {20, 21, 22}
        };
        System.out.println("Числа: " + nums3[1][2]);
    }
}