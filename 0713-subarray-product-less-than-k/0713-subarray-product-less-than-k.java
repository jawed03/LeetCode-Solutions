class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {

        int count = 0;
        int product = 1;
        int left = 0;
        int right = 0;

        if(k  <= 1)
        return 0;

        while(right < nums.length) {
            product *= nums[right];
            while(product >= k){
                product /= nums[left];
                left++;
            }
             
            count += (right - left + 1);
            right++;
        }
        return count;


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