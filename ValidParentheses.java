public class ValidParentheses {


    public void generateParenthesis(int n) {
        char[] current = new char[2 * n];
        backtrack(current, 0, 0, n);
    }

    private void backtrack(char[] current, int open, int close, int max) {
        if (open + close == max * 2) {
            System.out.println(new String(current));
            return;
        }

        if (open < max) {
            current[open + close] = '(';
            backtrack(current, open + 1, close, max);
        }

        if (close < open) {
            current[open + close] = ')';
            backtrack(current, open, close + 1, max);
        }
    }

    public static void main(String[] args) {
        ValidParentheses gen = new ValidParentheses();
        int n = 2;
        System.out.println("Valid Parentheses combinations for n = " + n + ":");
        gen.generateParenthesis(n);
    }
}
