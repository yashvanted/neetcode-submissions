class Solution {
    public boolean isValid(String s) {
        Stack <Character> stack = new Stack<>();
        HashMap<Character, Character> hashMap = new HashMap<>();
        hashMap.put('(',')');
        hashMap.put('[',']');
        hashMap.put('{','}');
        for(int i = 0 ; i < s.length(); i++){
            if(stack.isEmpty()){
                stack.push(s.charAt(i));
            }
            else{
                if(hashMap.containsKey(stack.peek()) && hashMap.get(stack.peek()).equals(s.charAt(i))){
                    stack.pop();
                }
                else{
                    stack.push(s.charAt(i));
                }
            }
        }
        if(stack.isEmpty()){
            return true;
        }




        return false;
    }
}