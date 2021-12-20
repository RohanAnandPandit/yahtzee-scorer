package yahtzee;

import yahtzee.scorers.RoundScorer;

public class Scorer {
    public static final int MAX_NUMBER = 6;
    private final InputScanner scanner = new InputScanner();
    private int score;
    
    public int score(String input) {
        Round round = scanner.getRound(input);
        RoundScorer scorer = round.getCategory().getScorer();
        score += scorer.score(round);
        
        return score;
    }
    
    protected int getTotalScore() {
        return score;
    }
}
