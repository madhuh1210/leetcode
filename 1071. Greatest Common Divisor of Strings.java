class Solution {
    public String gcdOfStrings(String str1, String str2) {

        // check if they share the same pattern
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }

        // gcd of lengths
        int gcdLen = gcd(str1.length(), str2.length());

        return str1.substring(0, gcdLen);
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int rem = a % b;
            a = b;
            b = rem;
        }
        return a;
    }
}
