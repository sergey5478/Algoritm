
class Solution(object):
    def twoSum(self, nums, target):
        num_dict = {}        
        for i, num in enumerate(nums):
            diff = target - num
            if diff in num_dict:
                return [num_dict[diff], i]
            num_dict[num] = i
        return []

s = Solution()
result = s.twoSum([2, 7, 11, 15], 18)
print(result)


