class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        map = [0] * 26
        for i in s:
            map[ord(i) - 97] += 1
        for i in t:
            map[ord(i) - 97] -=1
        for i in map:
            if(i != 0):
                return False
        return True
            