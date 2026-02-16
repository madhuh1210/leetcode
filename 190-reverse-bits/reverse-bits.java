class Solution {
    public int reverseBits(int n) {
        String bin = String.format("%32s", Integer.toBinaryString(n)).replace(' ','0');
        return (int) Long.parseLong(
            new StringBuilder(bin).reverse().toString(),2);       
    }
    
}