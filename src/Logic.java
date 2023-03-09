import java.util.Scanner;

public class Logic {
    private Board board;
    private Dice dice;
    public Logic() {
        board = new Board();
        dice = new Dice();
    }

    public void runGame() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Welcome to the Neighbors Game!\nPress (s) to start the game!");
        String userReady = scan.nextLine();
        if (userReady.equals("s") || userReady.equals("S")) {
            for (int i = 1; i <= 25; i++) {
                board.printBoard();
                int randomNum = dice.diceRoll();
                System.out.println("Dice roll number: " + randomNum);
                System.out.print("Which position do you want to place it in? Position #: ");
                int userPos = scan.nextInt();
                board.addNumToBoard(userPos, randomNum);
            }
            board.printBoard();

            System.out.println("Your total sum is " + getSum());
        }
    }

    public int getSum() {
        return board.getRowsSum() + board.getColumnsSum();
    }
}
