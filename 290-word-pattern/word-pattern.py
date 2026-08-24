class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        words = s.split()

        if len(pattern) != len(words):
            return False

        pattern_map = {}
        word_map = {}

        for i in range(len(pattern)):
            ch = pattern[i]
            word = words[i]

            if ch in pattern_map:
                if pattern_map[ch] != word:
                    return False
            else:
                pattern_map[ch] = word

            if word in word_map:
                if word_map[word] != ch:
                    return False
            else:
                word_map[word] = ch

        return True
        
         