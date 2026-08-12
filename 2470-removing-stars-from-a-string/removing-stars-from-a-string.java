class Solution {
    public String removeStars(String s) {
        Stack<Character> stk= new Stack();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(stk.isEmpty() || ch !='*'){
                stk.push(ch);
            }else{
                stk.pop();
            }

        }
        StringBuilder ans= new StringBuilder();
        while(! stk.isEmpty()){
            ans.append(stk.pop());
        }
        return ans.reverse().toString();
        
    }
}