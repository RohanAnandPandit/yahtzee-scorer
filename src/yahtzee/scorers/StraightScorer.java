package yahtzee.scorers;

import yahtzee.Round;

import java.util.List;

public abstract class StraightScorer implements RoundScorer {
    private final int length;
    private final int score;
    
    public StraightScorer(int length, int score) {
        this.length = length;
        this.score = score;
    }
    @Override
    public int score(Round round) {
        List<Integer> diceValues = round.getDiceValues();
        for (int i = 1; i < length; i++) {
            if (diceValues.get(i) != diceValues.get(i - 1) + 1) {
                return 0;
            }
        }
        return score;
    }
}