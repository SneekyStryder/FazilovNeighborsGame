import java.util.Arrays;

public class Board {
    private String[][] board = {{"(1)", "(2)", "(3)", "(4)", "(5)"},
                                {"(6)", "(7)", "(8)", "(9)", "(10)"},
                                {"(11)", "(12)", "(13)", "(14)", "(15)"},
                                {"(16)", "(17)", "(18)", "(19)", "(20)"},
                                {"(21)", "(22)", "(23)", "(24)", "(25)"}};

    public Board() {}

    public void addNumToBoard(String position, int num) {
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

    }

    public void printBoard() {
        for (String[] row : board) {
            System.out.println(Arrays.toString(row));
        }
    }

    public int getBoardLength() {
        return board.length;
    }
}
