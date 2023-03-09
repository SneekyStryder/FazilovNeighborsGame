import java.util.Arrays;

public class Board {
    private String[][] board = {{"(1)", "(2)", "(3)", "(4)", "(5)"},
                                {"(6)", "(7)", "(8)", "(9)", "(10)"},
                                {"(11)", "(12)", "(13)", "(14)", "(15)"},
                                {"(16)", "(17)", "(18)", "(19)", "(20)"},
                                {"(21)", "(22)", "(23)", "(24)", "(25)"}};

    public Board() {}

    public void addNumToBoard(int position, int num) {
        String fixedPosition = "(" + position + ")";
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (fixedPosition.equals(board[i][j])) {
                    board[i][j] = "" + num;
                }
            }
        }
    }

    public int getRowsSum() {
        int sum = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length - 1; j++) {
                if (board[i][j].equals(board[i][j + 1])) {
                    sum += positionToInt(board[i][j]) + positionToInt(board[i][j]);
                    int startIdx = j + 2;
                    while (startIdx < board[0].length - 1) {
                        if (board[i][j].equals(board[i][startIdx])) {
                            sum += positionToInt(board[i][j]);
                        }
                        else {
                            break;
                        }
                        startIdx++;
                    }
                }
            }
        }
        return sum;
    }

    public int getColumnsSum() {
        int sum = 0;
        for (int i = 0; i < board[0].length; i++) {
            for (int j = 0; j < board.length - 1; j++) {
                if (board[j][i].equals(board[j + 1][i])) {
                    sum += positionToInt(board[j][i]) + positionToInt(board[j][i]);
                    int startIdx = j + 2;
                    while (startIdx < board.length - 1) {
                        if (board[j][i].equals(board[j][startIdx])) {
                            sum += positionToInt(board[j][i]);
                        }
                        else {
                            break;
                        }
                        startIdx++;
                    }
                }
            }
        }
        return sum;
    }

    public void printBoard() {
        for (String[] row : board) {
            System.out.println(Arrays.toString(row));
        }
    }

    public int getBoardLength() {
        return board.length;
    }

    public int positionToInt(String position) {
        return Integer.parseInt(position);
    }
}
