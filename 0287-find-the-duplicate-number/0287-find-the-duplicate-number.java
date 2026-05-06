class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length;
        // Easy Methods:
        // 1. Using HashSet
        // 2. HashTable (Boolean / count element)
        // 3. Sorting Method

        // Floyd's cycle detection(Hare & Tortoise Method)

        int slow = nums[0];
        int fast = nums[0];
        // at least one duplicate is there for sure.
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while(slow != fast);
        
        // find the head of loop.
        fast = nums[0];
        while(slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }
        return fast;

        
        // // Mark visited index(element)

        // int ind = nums[0];
        // for(int i=0; i<n; i++){
        //     if(nums[ind] == -1)
        //         return ind;
            
        //     int temp = ind;
        //     ind = nums[ind];
        //     nums[temp] = -1;
        // }
        // return -1;
    }
}