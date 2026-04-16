class Solution {
    public int maxArea(int[] height) {
        int i = 0;
        int j = height.length-1;
        int max = 0;
        while(i<j){
            if(height[i] >= height[j]){
                int mul = height[j] * (j-i);
                if(max < mul){
                    max = mul;
                }
                j--;
            }
            else if(height[i]<= height[j]){
                int mul = height[i] * (j-i);
                if(max < mul){
                    max = mul;
                }
                i++;
            }
        }
        return max;
    }
}