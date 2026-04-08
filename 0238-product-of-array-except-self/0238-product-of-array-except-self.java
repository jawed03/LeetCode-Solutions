class Solution {
    public int[] productExceptSelf(int[] nums) {

        int n = nums.length;
        int prefix = 1;
        int[] ans = new int[n];
        // Calculate Prefix product
        for(int i=0; i<n; i++){
            ans[i] = prefix;
            prefix *= nums[i];
        }
        // Calculate Postfix product and multiply with prefix product to get result.
        int postfix = 1;
        for(int i=n-1; i>=0; i--){
            ans[i] *= postfix;
            postfix *= nums[i];
        }
        return ans;


            // Better Solution [TC -> O(n+n+n)=O(n) && SC -> O(n+n)=O(n)]

        // int n = nums.length;
        // int prefixProduct [] = new int [n];
        // int postfixProduct [] = new int [n];
        // int prefix = 1;
        // int postfix = 1;

        // // find prefix product of given Array...
        // for(int i=0; i<n; i++){
        //     prefixProduct[i] = prefix;
        //     prefix *= nums[i];
        // }
        // // find postfix product of given Array...
        // for(int i=n-1; i>=0; i--){
        //     postfixProduct[i] = postfix;
        //     postfix *= nums[i];
        // }

        // // Multiply prefix and postfix to get answer.
        // for(int i=0; i<n; i++){
        //     nums[i] = prefixProduct[i]*postfixProduct[i];
        // }
        // return nums;

        

        //Reduce S.C -> O(N)
        //T.C -> O(N + N)

        // int n = nums.length;
        // int ans [] = new int [n];
        // int curr = 1;

        // for(int i=0; i<n; i++){
        //     ans[i] = curr;
        //     curr *= nums[i];
        // } 
        // curr = 1;
        // for(int i=n-1; i>=0; i--){
        //     ans[i] *= curr;
        //     curr *= nums[i];
        // }
        // return ans;



            // BRUTE FORCE METHOD [TC -> O(n*n) && SC -> O(1)]
        
        // for(int i = 0; i < n; i++) {
        //     int pro = 1;
        //     for(int j = 0; j < n; j++) {
        //         if(i == j) continue;
        //         pro *= nums[j];
        //     }
        //     ans[i] = pro;
        // }
    }
}