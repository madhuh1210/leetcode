class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
       dict = {}
       for ch in nums:
            dict[ch] = dict.get(ch, 0)+1
       for ch , value in dict.items():
           if value > 1:
                return True
       return False


        