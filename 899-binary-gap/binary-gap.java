class Solution {
    public int binaryGap(int n) {
        String binary = Integer.toBinaryString(n);
        int prevIdx = -1;
        int maxDiff = 0;
        for(int i=0; i<binary.length(); i++){
            if(binary.charAt(i)=='1'){
              if (prevIdx != -1) {
            maxDiff = Math.max(maxDiff, i - prevIdx);
        }
        prevIdx = i;
            }
        }
        return maxDiff;
    }
}