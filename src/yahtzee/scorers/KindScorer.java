package yahtzee.scorers;

import yahtzee.Round;
import yahtzee.Scorer;

import java.util.List;

public class KindScorer implements RoundScorer {
    private final int kind;
    
    public KindScorer(int kind) {
        this.kind = kind;
    }
    
    @Override
    public int score(Round round) {
        if (isOfKind(round)) {
            int sum = sumOfAllNumbers(round);
            return sum;
        }
        return 0;
    }
    
    private boolean isOfKind(Round round) {
        return KindScorer.isOfKind(kind, round);
    }

    public static boolean isOfKind(int kind, Round round) {
        int[] freq = Round.getFrequencies(round);
        for (int n : freq) {
            if (n >= kind) {
                return true;
            }
        }
        return false;
    }
    
    public static int numberWithKind(int kind, Round round) {
        int[] freq = Round.getFrequencies(round);
        int n;
        for (int i = 0; i < Scorer.MAX_NUMBER; i++) {
            n = freq[i];
            if (n >= kind) {
                return i + 1;
            }
        }
        return 0;
    }
    
    private int sumOfAllNumbers(Round round) {
        List<Integer> diceValues = round.getDiceValues();
        int sum = 0;
        for (int n : diceValues) {
            sum += n;
        }
        return sum;
    }
}
