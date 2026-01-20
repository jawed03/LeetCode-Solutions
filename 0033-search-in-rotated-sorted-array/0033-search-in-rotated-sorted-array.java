class Solution {
    public int search(int[] nums, int target) {
                // Simple iteration method.

        // for(int i = 0; i < nums.length; i++){
        //     if(nums[i] == target)
        //     return i;
        // }
        // return -1;



                // Binary Search method

        int low = 0;
        int high = nums.length - 1;

        while(low <= high){
            int mid = low + (high - low)/2;
            if(nums[mid] == target){
                return mid;
            }     
                // Left half sorted
            else if(nums[low] <= nums[mid]){
                if(nums[low] <= target && target < nums[mid])
                // if element exists in left
                high = mid - 1;
                else
                // if element does not exist
                low = mid + 1;
            }

                // Right half sorted
            else{
                if(nums[mid] <= target && target <= nums[high])
                // if element exists in right
                low = mid + 1;
                else
                // if element does not exist
                high = mid - 1;
            }
        }
        return -1;
    }
}