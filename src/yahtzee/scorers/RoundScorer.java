package yahtzee.scorers;

import yahtzee.Round;

public interface RoundScorer {
    int score(Round round);
}
