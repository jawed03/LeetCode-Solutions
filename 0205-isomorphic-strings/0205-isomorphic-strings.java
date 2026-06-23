class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length())
            return false;

        int i = 0;
        int j = 0;
        HashMap<Character, Character> map = new HashMap<>();

        while(i < s.length()){
            char sChar = s.charAt(i);
            char tChar = t.charAt(j);

            if(map.containsKey(sChar)){
                if(map.get(sChar) != tChar)
                    return false;
            }
            else{
                if(map.containsValue(tChar))
                    return false;

                map.put(sChar, tChar);
            }
            i++;
            j++;
        }
        return true;
    }
}