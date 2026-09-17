class Solution:
    def longestConsecutive(self, nums: list[int]) -> int:
        num_set = set(nums)
        l = 0
        for num in num_set:
            if num-1 not in num_set:
                curr = num
                count =1
                while curr+1 in num_set:
                    curr +=1
                    count +=1

                l = max(l, count)

        return l