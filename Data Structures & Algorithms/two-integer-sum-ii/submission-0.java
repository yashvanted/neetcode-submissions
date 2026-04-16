class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Arrays.sort(numbers);
        int j = numbers.length-1;
        int i = 0;
        while(i<=j){
            if(target-numbers[i]<numbers[j]){
                j--;
            }
            else if(target-numbers[j]>numbers[i]){
                i++;
            }
            else{
                return new int[]{i+1,j+1};
            }
        }
        return new int[0];
    }
}