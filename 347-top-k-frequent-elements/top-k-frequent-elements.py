
class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        freq = {}
        ans = []
        for num in nums:
            freq[num] = freq.get(num, 0)+1
        
        items = list(freq.items())
        sorted_items = sorted(items , key = lambda x:x[1], reverse= True)

        top_k = sorted_items[:k]
        for ch in top_k:
            ans.append(ch[0])
        return ans