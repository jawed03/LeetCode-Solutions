class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length == 0)
            return new ArrayList();

        Map<String, List> map = new HashMap<>();

        // Create hashcode for every strings, and store it as key in Map.
        int[] hash = new int[26];

        for(String str : strs){
            Arrays.fill(hash, 0);
            for(char ch : str.toCharArray()){
                hash[ch - 'a']++;
            }
            
            StringBuilder sb = new StringBuilder();

            for(int i=0; i<26; i++){
                sb.append("#");
                sb.append(hash[i]);
            }
            // This is HashCode of string.
            String hashCode = sb.toString();

            // Store Strings in Map associated with their HashCode.
            if(!map.containsKey(hashCode)){
                map.put(hashCode, new ArrayList());
            }
            // Firstly, get a specific List that associated with key and then add string.
            map.get(hashCode).add(str);
        }
        return new ArrayList(map.values());
    }
}