class Solution {
    public int binarySearch(int[] nums, int i, int j, int target){
        if(i > j){
            return -1;
        }
        int mid = (j+i)/2;
        if(target < nums[mid]){
            return binarySearch(nums, i, mid - 1, target);
        }
        else if(target > nums[mid]){
            return binarySearch(nums, mid + 1, j, target);
        }
        else{
            return mid;
        }
    }

    public int search(int[] nums, int target) {
        int len = nums.length;
        int i = 0, j = len - 1;
        return binarySearch(nums, i, j, target);
    }
}