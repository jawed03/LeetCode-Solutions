class Solution {
    public int maxArea(int[] height) {
        
        int left = 0;
        int right = height.length - 1;
        int maxWater = 0;

        while(left < right){
            if(height[left] > height[right]){
                int water = height[right] * (right - left);
                maxWater = Math.max(maxWater, water);
                right--;
            } else {
                int water = height[left] * (right - left);
                maxWater = Math.max(maxWater, water);
                left++;
            }
        }
        return maxWater;
    }
}