public class Main {
    public static void main(String[] args) {
        Dice dice1 = new Dice();
        Dice dice2 = new Dice();

        DiceGame diceGame = new DiceGame(dice1, dice2);
        diceGame.play();
        diceGame.play();
        diceGame.play();
        diceGame.play();
    }
}