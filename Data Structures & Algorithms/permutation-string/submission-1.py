class Solution:
    def checkInclusion(self, s1: str, s2: str) -> bool:
        if len(s1) > len(s2):
            return False
        r = 0
        l = 0
        h1 = {}
        for c in s1:
            h1[c] = 1 + h1.get(c, 0)
        h2 = {}
        while r < len(s2):
            if (r-l+1 > len(s1)):
                h2[s2[l]] -= 1
                if h2.get(s2[l], 0) == 0:
                    h2.pop(s2[l],0)
                l += 1
            h2[s2[r]] = h2.get(s2[r], 0) + 1
            r += 1
            if (h1 == h2):
                return True
                break
        return False