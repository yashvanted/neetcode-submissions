class Solution {
    public int trap(int[] height) {
        int i = 0; 
        int j = height.length-1;
        int rMax = height[height.length-1];
        int lMax = height[0];
        int waterCount = 0;
        while(i < j){
            if(lMax < rMax){
                i++;
                lMax = Math.max(lMax, height[i]);
                int water = lMax - height[i];
                if(water > 0){
                    waterCount = waterCount + water;
                }
            }
            else{
                j--;
                rMax = Math.max(rMax, height[j]);
                int water = rMax - height[j];
                if(water > 0){
                    waterCount = waterCount + water;
                }
            }
        }
        return waterCount;

    }
}