class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
      char[] c = s.toCharArray();
      char[] v = t.toCharArray();
      Arrays.sort(c);
      Arrays.sort(v);
      return Arrays.equals(c, v);

    }
}