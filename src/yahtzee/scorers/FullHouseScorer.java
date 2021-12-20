package yahtzee.scorers;

import yahtzee.Round;

public class FullHouseScorer implements RoundScorer {
    public static final int FULL_HOUSE_SCORE = 25;

    @Override
    public int score(Round round) {
        if (KindScorer.isOfKind(2, round)
                && KindScorer.isOfKind(3, round)
                && KindScorer.numberWithKind(2, round)
                != KindScorer.numberWithKind(3, round)) {
            return FULL_HOUSE_SCORE;
        }
        return 0;
    }
}
