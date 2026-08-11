class Solution:
    def rotateString(self, s: str, goal: str) -> bool:
        for i in range(len(s)):
            new = s[i:] + s[:i]

            if new == goal:
                return True

        return False