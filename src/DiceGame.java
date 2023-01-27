public class DiceGame {
    private Dice dice1;
    private Dice dice2;

    public DiceGame(Dice dice1, Dice dice2) {
        this.dice1 = dice1;
        this.dice2 = dice2;
    }

    public void play() {
        dice1.roll();
        dice2.roll();

        int dice1FaceValue = dice1.getFaceValue();
        int dice2FaceValue = dice2.getFaceValue();

        if (dice1FaceValue + dice2FaceValue == 7) {
            System.out.println("You won the game");
        } else {
            System.out.println("You lost the game");
        }
    }
}
