public class Task {
    public static void main(String[] args) {
        int[][] result = new int[6][6];
        for (int i = 0; i < result.length; i++)
            result[i] = new int[i];

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                result[i][j] = i + j;
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

    }
}