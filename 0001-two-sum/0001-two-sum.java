class Solution {
    public int[] twoSum(int[] nums, int target) {

                        //  Using HashMap... (N*logN, S.C -> N)

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(map.containsKey(target - nums[i])){
                return new int []{map.get(target - nums[i]), i};
            }
            else{
                map.put(nums[i], i);
            }
        }
        return new int []{};


                          // GENERAL SOLUTION... (N*N, 1)

        // for(int i=0; i<nums.length-1; i++)
        // {
        //     for(int j=i+1; j<nums.length; j++)
        //     {
        //         if(nums[i] + nums[j] == target)
        //         {
        //           return new int []{i,j};
        //         }
        //     }
        // }
        // return new int[]{};



                        // OPTIMISED SOLUTION (Only for Sorted Array)

        // int low=0, high=nums.length-1;
        // while(low < high){
        //     if(nums[low] + nums[high] == target)
        //     return new int []{low, high};
        //     else if(nums[low] + nums[high] > target)
        //     high--;
        //     else 
        //     low++;
        // }
        // return new int[]{};

        // Arrays.sort(nums);
        // In this Method, only can track index of sorted Array
        // Not to Original Array
    }
}