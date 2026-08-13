class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stk = new Stack<>();

        for (int i = 0; i < tokens.length; i++) {
            String ch = tokens[i];

            if (ch.equals("+") || ch.equals("-") || ch.equals("*") || ch.equals("/")) {
                int first = stk.pop();
                int second = stk.pop();

                if (ch.equals("+"))
                    stk.push(second + first);
                else if (ch.equals("-"))
                    stk.push(second - first);
                else if (ch.equals("*"))
                    stk.push(second * first);
                else
                    stk.push(second / first);

            } else {
                stk.push(Integer.parseInt(ch));
            }
        }

        return stk.peek();
    }
}