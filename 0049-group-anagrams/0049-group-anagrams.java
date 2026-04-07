class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length == 0)
            return new ArrayList();

            // Make key by sorting every Strings.
        Map<String, List<String>> res = new HashMap<>();
        for(String str : strs){
            char [] charArray = str.toCharArray();
            Arrays.sort(charArray);
            // Key(Hash) value
            String sortedStr = new String(charArray);
            res.putIfAbsent(sortedStr, new ArrayList<>());
            res.get(sortedStr).add(str);
        }
        return new ArrayList<>(res.values());


            // Create Key(Hash) value using character's position.

        // Map<String, List> map = new HashMap<>();
        // // Create hashcode for every strings, and store it as key in Map.
        // int[] hash = new int[26];

        // for(String str : strs){
        //     Arrays.fill(hash, 0);
        //     for(char ch : str.toCharArray()){
        //         hash[ch - 'a']++;
        //     }
            
        //     StringBuilder sb = new StringBuilder();

        //     for(int i=0; i<26; i++){
        //         sb.append("#");
        //         sb.append(hash[i]);
        //     }
        //     // This is HashCode of string.
        //     String hashCode = sb.toString();

        //     // Store Strings in Map associated with their HashCode.
        //     if(!map.containsKey(hashCode)){
        //         map.put(hashCode, new ArrayList());
        //     }
        //     // Firstly, get a specific List that associated with key and then add string.
        //     map.get(hashCode).add(str);
        // }
        // return new ArrayList(map.values());

    }
}