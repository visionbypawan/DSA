class Solution {
    public String simplifyPath(String path) {
        Stack<String> stk = new Stack<>();
        String[] arr = path.split("/");

        for (int i = 0; i < arr.length; i++) {
            String ch = arr[i];

            if (ch.equals("") || ch.equals(".")) {
                continue;
            } 
            else if (ch.equals("..")) {
                if (!stk.isEmpty()) {
                    stk.pop();
                }
            } 
            else {
                stk.push(ch);
            }
        }

        StringBuilder ans = new StringBuilder();

        while (!stk.isEmpty()) {
            ans.insert(0, "/" + stk.pop());
        }

        return ans.length() == 0 ? "/" : ans.toString();
    }
}