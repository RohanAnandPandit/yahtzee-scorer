package yahtzee.scorers;

import yahtzee.Round;

public class YahtzeeScorer implements RoundScorer {
    public static final int YAHTZEE_SCORE = 50;
    
    @Override
    public int score(Round round) {
        if (KindScorer.isOfKind(5, round)) {
            return YAHTZEE_SCORE;
        }
        return 0;
    }
}
