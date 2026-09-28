class Solution:
    def maxDepth(self, s: str) -> int:
        d = 0
        max= 0
        for ch in s:
            if ch == "(":
                d += 1
                if d> max :
                    max = d
            if ch == ")":
                d -= 1

        return max