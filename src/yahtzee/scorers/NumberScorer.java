package yahtzee.scorers;

import yahtzee.Round;

public class NumberScorer implements RoundScorer {
    private final int digit;
    
    public NumberScorer(int digit) {
        this.digit = digit;
    }

    @Override
    public int score(Round round) {
        int[] freq = Round.getFrequencies(round);
        return freq[digit - 1] * digit;
    }
}
