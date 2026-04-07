class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length())
        return false;

        char [] hash = new char[26];

        for(int i=0; i<s.length(); i++){
            hash[s.charAt(i) - 'a']++;
            hash[t.charAt(i) - 'a']--;
        }
        for(int ele : hash){
            if(ele != 0)
                return false;
        }
        return true;
        
        // // Both strings should be equal length.
        // if(s.length() != t.length())
        // return false;

        // int[] charCounts = new int[26];     // Assuming only lowercase English letters

        // // Increment count for each character in 's' and Decrement for each in 't'.
        // for(int i=0; i<s.length(); i++){
        //     charCounts[s.charAt(i) - 'a']++;
        //     charCounts[t.charAt(i) - 'a']--;
        // }

        // // Chech if all counts are zero
        // for(int count : charCounts){
        //     if(count != 0){
        //         return false;
        //     }
        // }

        // return true;
    }
}