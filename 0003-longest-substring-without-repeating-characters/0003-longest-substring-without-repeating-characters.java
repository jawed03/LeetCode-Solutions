class Solution {
    public int lengthOfLongestSubstring(String s) {

                                // OPTIMAL SOLUTION

        // USING HASHMAP
        Map<Character, Integer> map = new HashMap<>();
        int left, right, maxLen;
        left = right = maxLen = 0;

        while(right < s.length()){
            char ch = s.charAt(right);
            if(map.containsKey(ch) &&  left <= map.get(ch)){
                left = map.get(ch) + 1;
            }
            map.put(ch, right);
            maxLen = Math.max(maxLen, right - left + 1);
            right++;
        }
        return maxLen;


        // int left =0, right =0;
        // int maxLen =0;
        // int n = s.length();
        // int hash[] = new int [256];
        // Arrays.fill(hash, -1);

        // while(right < n){
        //     // check charater is present in Hash or not.
        //     // If present, then make sure it is not between left and right pointer
        //     if(hash[s.charAt(right)] != -1){
        //         if(hash[s.charAt(right)] >= left){
        //         left = hash[s.charAt(right)] +1;
        //         }
        //     }

        //     // find maximum length of substring.
        //     // Store the current index of charater into Hash table
        //     int len = right - left +1;
        //     maxLen = Math.max(maxLen, len);
        //     hash[s.charAt(right)] = right;
        //     right++;
        // }

        // return maxLen;

        // T.C --> O(n)
        // S.C --> O(256)


                                    // BRUTE FORCE APPROACH

        // int len =0, maxLen =0;
        // int n = s.length();
        // for(int i=0; i<n; i++){
        // int hash[] = new int[256];      // Hash always start with zero elements
        //     for(int j=i; j<n; j++){
        //         // If charater already visited, terminate the 2nd loop
        //         if(hash[s.charAt(j)] != 0){
        //             break;
        //         }
        //         len = j -i +1;
        //         // Mark the table as charater is visited
        //         hash[s.charAt(j)]++;
        //     }
        //     maxLen = Math.max(maxLen, len);
        // }
        // return maxLen;

        // T.C --> O(n*n)
        // S.C --> O(256)
    }
}