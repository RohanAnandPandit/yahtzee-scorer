package yahtzee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputScanner {
 
    public Round getRound(String input) {
        List<Integer> diceValues = getDiceValues(input);
        Category category = getCategory(input);
        return new Round(diceValues, category);
    }
    
    private List<Integer> getDiceValues(String input) {
        Scanner scanner = new Scanner(numberSequence(input));
        List<Integer> values = new ArrayList<>();
        while (scanner.hasNextInt()) {
            values.add(scanner.nextInt());
        }
        return values;
    }

    public Category getCategory(String input) {
        String[] words = input.split("\\s");
        return Category.valueOf(categoryName(words[words.length - 1]));
    }
    
    private String categoryName(String name) {
        return name.toUpperCase().replaceAll("-", "_");
    }
    
    private String numberSequence(String input) {
        return removeCommas(insideParentheses(input));
    }
    
    private String insideParentheses(String input) {
        return input.substring(1, input.indexOf(')'));
    }
    
    private String removeCommas(String input) {
        return input.replaceAll(",", "");
    }
}
