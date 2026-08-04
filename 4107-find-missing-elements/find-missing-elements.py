class Solution:
    def findMissingElements(self, nums: List[int]) -> List[int]:
        minx  = min(nums)
        maxx  = max(nums)
        s = set(nums)
        ans =[]
        for i in range(minx+1, maxx):
          
            if i not in s:
                ans.append(i)
        return ans   
