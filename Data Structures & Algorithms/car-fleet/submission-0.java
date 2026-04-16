class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        HashMap <Integer, Integer> hashMap = new HashMap<>();
        int l = position.length;
        for(int i = 0; i < l; i++){
            hashMap.put(position[i], speed[i]);
        }
        
        Set<Integer> setSort = hashMap.keySet();
        List<Integer> listSort = new ArrayList<>(setSort);
        Collections.sort(listSort);

        List<Double> time = new ArrayList<>();
        
        for(int x : listSort){
            float val = target - x;
            float div = val / hashMap.get(x);
            double ans = div;
            time.add(ans);
        }

        Stack<Double> stack = new Stack<>();
        double max = 0.0;
        int count = 1;
        for(double x : time){
            if(stack.isEmpty()){
                stack.push(x);
            }
            else{
                while(!stack.isEmpty() && stack.peek() <= x){
                    stack.pop();
                }
                stack.push(x);
            }
        }
        return stack.size();
    }
}