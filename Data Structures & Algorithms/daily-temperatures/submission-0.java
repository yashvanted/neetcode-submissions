class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack = new Stack<>();
        int l = temperatures.length;
        int[] ans = new int[l];
        for(int i = 0; i < l; i++){
            if(stack.isEmpty()){
                stack.push(i);
            }
            else{
                while(!stack.isEmpty() && temperatures[i] - temperatures[stack.peek()] > 0){
                    ans[stack.peek()] = i - stack.peek();
                    stack.pop();
                }
                stack.push(i);
            }
        }
        return ans;
    }
}