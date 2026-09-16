class Solution:
    def groupAnagrams(self, strs: list[str]) -> list[list[str]]:
        grp={}
        for word in strs:
            sorted_word = sorted(word)
            sorted_word = "".join(sorted_word)

            if sorted_word not in grp:
                grp[sorted_word]=[]

            grp[sorted_word].append(word)

        return list(grp.values())