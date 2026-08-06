class Solution:
    def subtractProductAndSum(self, n: int) -> int:
        S = 0
        P = 1
        copy = n
        while copy > 0:
            ld = copy % 10
            P = P * ld
            S = S + ld
            copy //= 10
                   
        return P-S 

