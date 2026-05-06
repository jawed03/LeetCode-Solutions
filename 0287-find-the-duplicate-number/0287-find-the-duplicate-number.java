class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length;

        // Floyd's cycle detection(Hare & Tortoise Method)
        
        // Mark visited index(element)
        int ind = nums[0];
        for(int i=0; i<n; i++){
            if(nums[ind] == -1)
                return ind;
            
            int temp = ind;
            ind = nums[ind];
            nums[temp] = -1;
        }
        return -1;
    }
}