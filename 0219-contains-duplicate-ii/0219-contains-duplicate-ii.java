class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if(k == 0)
        return false;

        Set<Integer> set = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            if(set.contains(nums[i]))
                return true;
            set.add(nums[i]);
            if(set.size() > k){
                set.remove(nums[i - k]);
            }
        }
        return false;

                // Same method but other way.. 

        // HashSet<Integer> seenNumbers = new HashSet<>();
        // int right;
        // int left = 0;

        // // Create K length window.
        // for(right=0; right <= k && right < nums.length; right++){
        //     if(seenNumbers.contains(nums[right]))
        //     return true;
        //     seenNumbers.add(nums[right]);
        // }

        // // Check duplicate.
        // while(right < nums.length) {
        //     seenNumbers.remove(nums[left]);
        //     left++;
        //     if(seenNumbers.contains(nums[right]))
        //     return true;
        //     seenNumbers.add(nums[right]);
        //     right++;
        // }
        // return false;
    }
}