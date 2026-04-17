class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        l = []
        ans = []
        for i in nums:
            if((target - i) in l):
                ans.append(nums.index(target - i))
                nums[nums.index(target-i)] = -10000001
                ans.append(nums.index(i))
            else:
                l.append(i)
        return ans