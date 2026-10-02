class Solution:
    def search(self, nums: List[int], target: int) -> int:
        low = 0
        high = len(nums) - 1
        while(low <= high):
            ind = low + ((high-low)//2)
            if(nums[ind] > target):
                high = ind - 1 
            elif(nums[ind] < target):
                low = ind + 1
            else:
                return ind
        return -1