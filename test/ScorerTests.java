import org.junit.Assert;
import org.junit.Test;
import yahtzee.InputScanner;
import yahtzee.Scorer;
import yahtzee.scorers.FullHouseScorer;
import yahtzee.scorers.LargeStraightScorer;
import yahtzee.scorers.SmallStraightScorer;
import yahtzee.scorers.YahtzeeScorer;

import java.util.List;

public class ScorerTests {

    @Test
    public void ScanInputValues() {
        final InputScanner scanner = new InputScanner();

        String input = "(1, 2, 3, 4, 5) ones";
        List<Integer> values =
                scanner.getRound(input).getDiceValues();
        
        for (int i = 1; i < 6; i++) {
            Assert.assertTrue(values.contains(i));
        }
    }
    
    @Test
    public void OnesScorerReturnsCorrectValue() {
        Scorer scorer = new Scorer();
        String round = "(1, 2, 3, 4, 5) ones";
        int score = scorer.score(round);
        Assert.assertEquals(1, score);
    }
    
    @Test
    public void FullHouseScorerReturnsCorrectValue() {
        Scorer scorer = new Scorer();
        String round = "(2, 2, 3, 3, 3) full-house";
        int score = scorer.score(round);
        Assert.assertEquals(FullHouseScorer.FULL_HOUSE_SCORE, score);
    }

    @Test
    public void YahtzeeScorerReturnsCorrectValue() {
        Scorer scorer = new Scorer();
        String round = "(3, 3, 3, 3, 3) yahtzee";
        int score = scorer.score(round);
        Assert.assertEquals(YahtzeeScorer.YAHTZEE_SCORE, score);
    }

    @Test
    public void SmallStraightScorerReturnsCorrectValue() {
        Scorer scorer = new Scorer();
        String round = "(1, 2, 3, 4, 3) small-straight";
        int score = scorer.score(round);
        Assert.assertEquals(SmallStraightScorer.SCORE, score);
    }

    @Test
    public void LargeStraightScorerReturnsCorrectValue() {
        Scorer scorer = new Scorer();
        String round = "(1, 2, 3, 4, 5) large-straight";
        int score = scorer.score(round);
        Assert.assertEquals(LargeStraightScorer.SCORE, score);
    }
}
