class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if(pattern.length() != words.length){
            return false;
        }

        Map<Character, String> map = new HashMap<>();
        Map<String, Character> reversemap = new HashMap<>();

        for(int i=0; i<pattern.length(); i++){
            char ch = pattern.charAt(i);
            String word = words[i];

            if(map.containsKey(ch)){
                if(!map.get(ch).equals(word)){
                    return false;
                }
            }
            else{
                map.put(ch,word);
            }

            if(reversemap.containsKey(word)){
                if(reversemap.get(word) != ch){
                    return false;
                }
            }else{
                reversemap.put(word,ch);
            }
        }
        return true;
    }
}