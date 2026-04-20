class Solution {
    public int maxDistance(int[] colors) {

        // Max distance must be with either one extream end house.
        int n = colors.length;
        for (int i = 0; i < n; i++)
            if (colors[i] != colors[n - 1] || colors[n - 1 - i] != colors[0])
                return n - 1 - i;

        return 0;

        // // BRUTE FORCE METHOD
        // int maxDist = 0;
        // int n = colors.length;
        // for(int i=0; i<n; i++){
        //     int dist = 0;
        //     for(int j=i; j<n; j++){
        //         if(colors[i] != colors[j]){
        //             dist = j - i;
        //         }
        //     }
        //     maxDist = maxDistance < dist ? dist : maxDist;
        // }
        // return maxDist;
    }
}