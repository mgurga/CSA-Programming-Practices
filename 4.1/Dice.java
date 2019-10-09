public class Dice
{
    int sides;

    public Dice(int initSides) {
        this.sides = initSides + 1;
    }

    public int roll() {
        return ((int) (sides * Math.random()));
    }
}