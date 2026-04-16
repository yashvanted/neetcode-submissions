class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hashmap = new HashMap<Integer,Integer>();
        int i = 0;
        for(i = 0; i < nums.length; i++){
            if(hashmap.containsKey(target-nums[i])){
                return new int[] {hashmap.get(target-nums[i]),i};
            }
            else{
                hashmap.put(nums[i],i);
            }
        }
        return null;
    }
}

