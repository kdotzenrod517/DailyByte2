package backtracking;

import java.util.ArrayList;
import java.util.List;

public class ParenthesesGeneration {

    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<String>();
        generateValidParentheses(result, new StringBuilder(), 0, 0, n);

        return result;
    }

    public void generateValidParentheses(List<String> result, StringBuilder current, int open, int close, int n) {
        if(current.length() == n * 2) {
            result.add(current.toString());
            return;
        }

        if(open < n) {
            current.append("(");
            generateValidParentheses(result, current, open + 1, close, n);
            current.deleteCharAt(current.length() - 1);
        }

        if(close < open) {
            current.append(")");
            generateValidParentheses(result, current, open, close + 1, n);
            current.deleteCharAt(current.length() - 1);
        }
    }
}
