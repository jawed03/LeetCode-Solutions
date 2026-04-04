class Solution {
    public int subarraySum(int[] nums, int k) {

        // Optimal Solution (Prefix sum Approach) [TC -> O(n) & SC -> O(n)]
        HashMap<Integer, Integer> sumCountMap = new HashMap<>();
        sumCountMap.put(0, 1);
        int prefixSum = 0;
        int count = 0;

        for(int num : nums){
            prefixSum += num;
            if(sumCountMap.containsKey(prefixSum - k)) {
                count += sumCountMap.get(prefixSum - k);
            }

            sumCountMap.put(prefixSum, sumCountMap.getOrDefault(prefixSum, 0) + 1);
        }
        return count;


        // // Brute Force Method [TC -> O(n*n) & SC -> O(1)]
        // int count=0;
        // int n = nums.length;
       
        // for(int i=0; i<n; i++){
        // int sum=0;
        //     for(int j=i; j<n; j++){
        //         sum+=nums[j];
        //         if(sum == k)
        //         count++;
        //     }
        // }
        // return count;
    }
}