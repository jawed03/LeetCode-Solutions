class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {

                 // Optimal (Sliding Window) [TC -> O(n) && SC -> O(1)]
        int left = 0;
        int product = 1;
        int count = 0;
        for(int right=0; right < nums.length; right++){
            product *= nums[right];
            
            while(product >= k && left <= right){
                product /= nums[left];
                left++;
            }
            count += (right - left + 1);
        }
        return count;


                 // // Brute Force [TC -> O(n*n) && SC -> O(1)]
        // int count = 0;
        // for(int i=0; i<nums.length; i++){
        //     int product = 1;
        //     for(int j=i; j<nums.length; j++){
        //         product *= nums[j];
        //         if(product >= k)
        //         break;

        //         count += 1;
        //     }
        // }
        // return count;
    }
}