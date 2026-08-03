class Solution:
    def canConstruct(self, ransomNote: str, magazine: str) -> bool:
        mag={}
        rn={}
        for ch in ransomNote:
            rn[ch] = rn.get(ch, 0) + 1
        for ch in magazine:
            mag[ch] = mag.get(ch,0)+1

        for ch in ransomNote:
            if ch not in mag:
                return False
            if rn[ch] > mag[ch]:
                return False
        return True    
