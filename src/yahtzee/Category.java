package yahtzee;

import yahtzee.scorers.*;
import yahtzee.scorers.YahtzeeScorer;

public enum Category {
    ONES(new NumberScorer(1)),
    TWOS(new NumberScorer(2)),
    THREES(new NumberScorer(3)),
    FOURS(new NumberScorer(4)),
    FIVES(new NumberScorer(5)),
    SIXES(new NumberScorer(6)),
    TWO_OF_A_KIND(new KindScorer(2)),
    THREE_OF_A_KIND(new KindScorer(3)),
    FOUR_OF_A_KIND(new KindScorer(4)),
    YAHTZEE(new YahtzeeScorer()),
    FULL_HOUSE(new FullHouseScorer()),
    SMALL_STRAIGHT(new SmallStraightScorer()),
    LARGE_STRAIGHT(new LargeStraightScorer())
    ;
    
    private final RoundScorer scorer;
    
    Category(RoundScorer scorer) {
        this.scorer = scorer;
    }
    
    public RoundScorer getScorer() {
        return scorer;
    }
}
