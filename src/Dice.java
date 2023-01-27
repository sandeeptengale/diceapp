import java.util.Random;

public class Dice {
    private int faceValue;

    public int getFaceValue() {
        return faceValue;
    }

    public void roll() {
        int max = 6;
        int min = 1;
        this.faceValue =  (int) Math.abs(Math.random() *(max - min + 1) + min);
    }
}
