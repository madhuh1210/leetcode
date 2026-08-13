class Solution:
    def judgeCircle(self, moves: str) -> bool:
        x=0
        y=0
        for ch in moves:
            if ch == "U":
                y+= 1
            elif ch == "D":
                y-=1
            elif ch == "L":
                x -= 1
            elif ch == "R":
                x += 1
        if x == 0 and y == 0:
            return True
        else:
            return False