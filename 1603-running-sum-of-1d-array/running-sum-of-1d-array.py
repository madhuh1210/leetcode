class Solution:
    def runningSum(self, nums: List[int]) -> List[int]:
        res = []
        currsum=0
        for i in range(len(nums)):
            currsum += nums[i]
            res.append(currsum)
        return res