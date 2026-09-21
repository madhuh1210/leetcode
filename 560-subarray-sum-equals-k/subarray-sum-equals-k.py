class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        c =0
        p =0
        f = {0:1}
        for i in range (len(nums)):
            p += nums[i]
            n = p- k
            if n in f :
                c += f[n]
            f[p]= f.get(p,0)+1
        return c