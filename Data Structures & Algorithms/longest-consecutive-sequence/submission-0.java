class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        Set<Integer> hashSet = new HashSet<>();
        for(int i = 0; i<nums.length; i++){
            hashSet.add(nums[i]);
        }
        List<Integer> list = new ArrayList<>(hashSet);
        int max = 1;
        int count = 1;
        Collections.sort(list);
        
        int arr[] = new int[list.size()];
        int cnt = 0;
        for(Integer x: list){
            arr[cnt] = x;
            cnt++;
        }
        
        for(int i = 0; i<list.size();i++){
            if(i!=0 && arr[i] == arr[i-1]+1){
                count++;
                if(max<count){
                    max = count;
                }
            }
            else if(i!=0 && arr[i]!= arr[i-1]+1){
                count = 1;
            }
        }
        return max;
    }
}