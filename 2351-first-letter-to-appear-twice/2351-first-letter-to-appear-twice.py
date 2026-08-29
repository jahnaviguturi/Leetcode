class Solution:
    def repeatedCharacter(self, s: str) -> str:
        set_s = set()

        for ch in s:
            if ch in set_s:
                return ch
            set_s.add(ch)
    
        return ' '