public class Dice {
    public Dice() {}

    public int diceRoll() {
        return (int) (Math.random() * 10) + 1;
    }
}
