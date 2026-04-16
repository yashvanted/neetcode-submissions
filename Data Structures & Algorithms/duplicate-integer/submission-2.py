class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        hashMap = {i : 0 for i in nums}
        for i in nums:
            hashMap[i] = hashMap[i] + 1
            if(hashMap[i] > 1):
                return True
        return False


        