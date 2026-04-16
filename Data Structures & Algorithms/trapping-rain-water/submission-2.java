class Solution {
    public int trap(int[] height) {
        int L = 0;
        int R = 1;
        int sum = 0;
        while(L < R && R < height.length){
            if(height[R] >= height[L]){
                for(int i = L+1; i < R; i++){
                    sum = sum + Math.min(height[L], height[R]) - height[i];
                }
                L = R;
            }
            R++;
        }
        int LL = height.length - 2;
        int RL = height.length - 1;
        while(LL < RL && LL >=  0){
            if(height[RL] < height[LL]){
                for(int i = RL-1; i > LL; i--){
                    sum = sum + Math.min(height[LL], height[RL]) - height[i];
                }
                RL = LL;
            }
            LL--;
        }
        return sum;
    }
}