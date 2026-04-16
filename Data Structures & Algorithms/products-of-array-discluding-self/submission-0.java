class Solution {
    public int[] productExceptSelf(int[] nums) {
        int arr[] = new int[nums.length];
        int revarr[] = new int[nums.length];
        int ans[] = new int[nums.length];
        for(int i = 0; i<nums.length; i++){
            if(i == 0){
                arr[i] = nums[i];
            }
            else{
                arr[i] = arr[i-1]*nums[i];
            }
        }
        for(int i = nums.length-1; i>=0; i--){
            if(i == nums.length-1){
                revarr[i] = nums[nums.length-1];
            }
            else{
                revarr[i] = revarr[i+1]*nums[i];
            }
        }
        for(int i = 0; i<nums.length; i++){
            if(i == 0){
                ans[i] = revarr[i+1];
            }
            else if(i == nums.length-1){
                ans[i] = arr[i-1];
            }
            else{
                ans[i] = arr[i-1]*revarr[i+1];
            }
        }
        return ans;
    }
}