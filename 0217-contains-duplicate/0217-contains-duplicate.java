class Solution {
    public boolean containsDuplicate(int[] nums) {

                    // OPTIMAL SOLUTION (USING HASHSET)
                    // TC-> O(N) & SC-> O(N)
                    
        HashSet<Integer> set = new HashSet<>();

        for(int num : nums){
            // Chech HashSet contains element or not
            if(set.contains(num)){
                return true;    // Duplicate found
            }
            set.add(num);
        }
        return false;   // No duplicate found


                        // Better Solution (Using Sorting method)
                        // TC-> O(NlogN) & SC-> O(1)

        // Arrays.sort(nums);
        // for(int i=0; i<nums.length-1; i++){
        //     // Chech duplicates
        //     if(nums[i] == nums[i+1]){
        //         return true;        // Duplicate found
        //     }
        // }
        // return false;      // No duplicate found


                        // Brute Force Solution(2 Loops)
                        // TC-> O(N*N) & SC-> O(1)

        // for(int i=0; i<nums.length; i++){
        //     for(int j=i+1; j<nums.length; j++){
        //         // Chech duplicates
        //         if(nums[i] == nums[j]){
        //             return true;        // Duplicate found
        //         }
        //     }
        // }
        // return false;       // No duplicate found
    }
}