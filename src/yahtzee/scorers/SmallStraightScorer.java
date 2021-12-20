package yahtzee.scorers;

public class SmallStraightScorer extends StraightScorer {
    public static final int LENGTH = 4;
    public static final int SCORE = 30;
    
    public SmallStraightScorer() {
        super(LENGTH, SCORE);
    }
}
