package yahtzee;

import java.util.List;

public class Round {
    private final List<Integer> diceValues;
    private final Category category;
    
    public Round(List<Integer> diceValues, Category category) {
        this.diceValues = diceValues;
        this.category = category;
    }
    
    public List<Integer> getDiceValues() {
        return diceValues;
    }
    
    public Category getCategory() {
        return category;
    }
    
    public static int[] getFrequencies(Round round) {
        int[] freq = new int[Scorer.MAX_NUMBER];
        List<Integer> diceValues = round.getDiceValues();
        for (Integer n : diceValues) {
            freq[n - 1] += 1;
        }
        return freq;
    }
}
