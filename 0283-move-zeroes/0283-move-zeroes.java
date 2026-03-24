class Solution {
    public void moveZeroes(int[] nums) {

                // Optimal Solution

        int firstZeroIndx = -1;
        for(int i=0; i<nums.length; i++) {
            if(nums[i] == 0){
                firstZeroIndx = i;
                break;
            }
        }

        // Don't have any zero
        if(firstZeroIndx == -1)
        return;

        int j = firstZeroIndx;
        for(int i=j+1; i<nums.length; i++){
            if(nums[i] != 0){
                // swapping
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }


                // Brute Force Method

        // int i=0;
        // for(int j=0; j<nums.length; j++)
        // {
        //     if(nums[j] != 0)
        //     nums[i++] = nums[j];
        // }
        // while(i<nums.length){
        //     nums[i++] = 0;
        // }

    }
}