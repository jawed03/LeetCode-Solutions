class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length())
            return false;

        int i = 0;
        int j = 0;
        HashMap<Character, Character> map = new HashMap<>();

        while(i < s.length()){
            char firstChar = s.charAt(i);
            char secondChar = t.charAt(j);

            if(map.containsKey(firstChar)){
                if(map.get(firstChar) != secondChar)
                    return false;
            }
            else{
                if(map.containsValue(secondChar))
                    return false;
                    
                map.put(firstChar, secondChar);
            }
            i++;
            j++;
        }
        return true;
    }
}