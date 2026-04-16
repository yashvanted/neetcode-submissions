class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap <Integer,Integer> hashMap = new HashMap<Integer,Integer>();
        Arrays.sort(nums);
        int j = 1;
        for(int i = 0; i < nums.length; i++){
            if(hashMap.containsKey(nums[i])){
                return true;
            }
            else{
                hashMap.put(nums[i],j);
            }
        }
        return false;
    }
}
