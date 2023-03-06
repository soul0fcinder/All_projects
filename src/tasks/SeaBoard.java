package tasks;

public class SeaBoard {
    private String[][] field;

    public SeaBoard() {
        field = new String[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                field[i][j] = ".";
            }
        }
    }

    String[][] getField() {
        String[][] result = new String[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (field[i][j].equals("X")) result[i][j] = "x";
                else result[i][j] = field[i][j];
            }
        }
        return result;
    }

    String check(int line, int column) {
        if (field[line][column].equals("X")) return "x";
        return field[line][column];
    }

    void shoot(int line, int column, String issue) {
        if (issue.equals("m")) field[line][column] = "#";
        else if (issue.equals("h")) field[line][column] = "X";
        else {
            field[line][column] = "X";
            sink(line, column);
        }
    }

    private void sink(int line, int column) {
        int[][] commands = new int[][] {{line - 1, column}, {line + 1, column},
                        {line, column - 1}, {line, column + 1},
                        {line - 1, column - 1}, {line - 1, column + 1},
                        {line + 1, column - 1}, {line + 1, column + 1}};

        for (int[] i : commands) {
            if (0 <= i[0] && i[0] <= 9 && 0 <= i[1] && i[1] <= 9 &&
                    field[i[0]][i[1]].equals(".")) {
                    field[i[0]][i[1]] = "#";
            }
        }
        field[line][column] = "x";

        for (int[] i : commands) {
            if (0 <= i[0] && i[0] <= 9 && 0 <= i[1] && i[1] <= 9 && field[i[0]][i[1]].equals("X")) {
                sink(i[0], i[1]);
            }
        }
    }
}

class Main {
    public static void main(String[] args) {
        SeaBoard board = new SeaBoard();
        board.shoot(0, 0, "m");
        board.shoot(2, 0, "h");
        board.shoot(6, 9, "h");
        board.shoot(2, 1, "d");
        for (int i = 0; i < board.getField().length; i++) {
            for (int j = 0; j < board.getField()[0].length; j++) {
                System.out.print(board.getField()[i][j] + " ");
            }
            System.out.println();
        }
    }
}
