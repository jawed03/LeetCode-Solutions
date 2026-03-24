class Solution {
    public int secondHighest(String s) {
        int large = -1;
        int scnd_large = -1;

        for(char ch : s.toCharArray()){
            if(ch >= '0' && ch <= '9') {
                int ele = ch - '0';
                if(ele > large) {
                    scnd_large = large;
                    large = ele;
                } else if(ele > scnd_large && ele < large) {
                    scnd_large = ele;
                }
            }
        }
        return scnd_large;
    }
}