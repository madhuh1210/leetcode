
class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        freq = {}
        ans = []

        for num in nums:
            freq[num] = freq.get(num, 0) + 1

        items = list(freq.items())

        sorted_items = sorted(items, key=lambda x: x[1], reverse=True)

        topk = sorted_items[:k]

        for item in topk:
            ans.append(item[0])

        return ans
