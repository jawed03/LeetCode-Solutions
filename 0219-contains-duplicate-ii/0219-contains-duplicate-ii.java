class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if(k == 0)
        return false;

        HashSet<Integer> seenNumbers = new HashSet<>();
        int right;
        int left = 0;

        // Create K length window.
        for(right=0; right <= k && right < nums.length; right++){
            if(seenNumbers.contains(nums[right]))
            return true;
            seenNumbers.add(nums[right]);
        }

        // Check duplicate.
        while(right < nums.length) {
            seenNumbers.remove(nums[left]);
            left++;
            if(seenNumbers.contains(nums[right]))
            return true;
            seenNumbers.add(nums[right]);
            right++;
        }
        return false;
    }
}