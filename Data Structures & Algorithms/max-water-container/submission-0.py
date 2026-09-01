class Solution:
    def maxArea(self, heights: List[int]) -> int:
        low = 0
        high = len(heights) - 1
        max = 0
        while low <= high:
            calc = (high-low)*min(heights[low],heights[high])
            if calc > max:
                max = calc
            if(heights[low] < heights[high]):
                low += 1
            else:
                high -= 1
        return max