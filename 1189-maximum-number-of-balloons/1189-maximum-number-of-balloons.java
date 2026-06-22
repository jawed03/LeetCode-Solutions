class Solution {
    public int maxNumberOfBalloons(String text) {
        int maxBalloons = Integer.MAX_VALUE;
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('b', 0);
        map.put('a', 0);
        map.put('l', 0);
        map.put('o', 0);
        map.put('n', 0);

        for(char ch : text.toCharArray()) {
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch)+1);
            }
        }

        for(char ch : map.keySet()){
            if(ch == 'b' || ch == 'a' || ch == 'n'){
                maxBalloons = maxBalloons > map.get(ch) ? map.get(ch) : maxBalloons;
            }
            else if(ch == 'l' || ch == 'o'){
                maxBalloons = maxBalloons > map.get(ch)/2 ? map.get(ch)/2 : maxBalloons;
            }
        }
        return maxBalloons;
    }
}