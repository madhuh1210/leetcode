class Solution {
    public int largestAltitude(int[] gain) {
        int altitude =0;
        int[] res = new int[gain.length+1];
        res[0] = 0;
        for(int i=0; i<gain.length; i++){
             altitude += gain[i];
             res[i + 1] = altitude;
        }
         int max = res[0];
       for(int i = 1; i < res.length; i++) {
            if(res[i] > max) {
                max = res[i];
            }
        }

        return max;
    }
}