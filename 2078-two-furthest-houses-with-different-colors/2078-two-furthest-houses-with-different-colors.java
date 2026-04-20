class Solution {
    public int maxDistance(int[] colors) {
        int maxDistance = 0;
        int n = colors.length;
        for(int i=0; i<n; i++){
            int dist = 0;
            for(int j=i; j<n; j++){
                if(colors[i] != colors[j]){
                    dist = j - i;
                }
            }
            maxDistance = maxDistance < dist ? dist : maxDistance;
        }
        return maxDistance;
    }
}