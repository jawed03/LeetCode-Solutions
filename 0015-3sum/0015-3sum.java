class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

                // Brute Force Method (N*N*N, 1)

        // int n = nums.length;
        // Set<List<Integer>> set = new HashSet<>();

        // for (int i = 0; i < n - 2; i++) {
        //     for (int j = i + 1; j < n - 1; j++) {
        //         for (int k = j + 1; k < n; k++) {
        //             if (nums[i] + nums[j] + nums[k] == 0) {
        //                 List<Integer> triplet = Arrays.asList(nums[i], nums[j], nums[k]);
        //                 // to avoid duplicate orderings
        //                 Collections.sort(triplet); 
        //                 set.add(triplet);
        //             }
        //         }
        //     }
        // }
        // return new ArrayList<>(set);

        
                // Better Approach(HashMap Method)

        int n = nums.length;
        HashSet<List<Integer>> tripletes = new HashSet<>();
        for(int i=0; i<n-1; i++){
            // 'set' initialize here so, it get empty in every iteration of below loop. 
            HashSet<Integer> set = new HashSet<>();
            for(int j=i+1; j<n; j++){
                // 3rd elements that required
                int required = 0 - (nums[i] + nums[j]);
                if(set.contains(required)){
                    // triplet get empty while controller comes into this scope.
                    List<Integer> triplet = Arrays.asList(nums[i], nums[j], required);
                    // sort the elements of every triplet. So, avoid duplicate triples
                    Collections.sort(triplet);
                    tripletes.add(triplet);
                }
                // Add element in HashSet to check required element
                set.add(nums[j]);
            }
        }
        return new ArrayList<>(tripletes);
    }
}