package yahtzee.scorers;

public class LargeStraightScorer extends StraightScorer{
    public static final int LENGTH = 5;
    public static final int SCORE = 40;

    public LargeStraightScorer() {
        super(LENGTH, SCORE);
    }
}
