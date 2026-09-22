class Solution:
    def isValidSudoku(self, board: list[list[str]]) -> bool:

        # Check rows
        for i in range(9):
            freq = {}

            for j in range(9):
                val = board[i][j]

                if val == ".":
                    continue

                if val in freq:
                    return False

                freq[val] = 1

        # Check columns
        for i in range(9):
            freq = {}

            for j in range(9):
                val = board[j][i]

                if val == ".":
                    continue

                if val in freq:
                    return False

                freq[val] = 1

        # Check 3x3 boxes
        for row in range(0, 9, 3):
            for col in range(0, 9, 3):

                freq = {}

                for i in range(3):
                    for j in range(3):

                        val = board[row + i][col + j]

                        if val == ".":
                            continue

                        if val in freq:
                            return False

                        freq[val] = 1

        return True