class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stk= new Stack();
        int j=0;
        for(int i=0;i<pushed.length;i++){
            if(pushed[i] != popped[j]){
                stk.push(pushed[i]);
            }else{
                j++;
                while(!stk.isEmpty() && stk.peek()== popped[j]){
                    stk.pop();
                    j++;
                }
            }
        }
        if(stk.isEmpty()){
            return true;
        }else{
            return false;
        }
        
        
    }
}