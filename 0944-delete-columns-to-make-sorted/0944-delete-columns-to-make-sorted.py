class Solution:
    def minDeletionSize(self, strs: List[str]) -> int:
        cnt = 0
        for col in range(len(strs[0])):
            for row in range(1, len(strs)):
                if strs[row][col] < strs[row - 1][col]:
                    cnt += 1
                    break

        return cnt
